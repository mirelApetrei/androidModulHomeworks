package de.syntax_institut.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import de.syntax_institut.myapplication.R
import de.syntax_institut.myapplication.data.model.Specie
import de.syntax_institut.myapplication.databinding.ListSpecieBinding

class SpeciesAdapter(
    private val context: Context,
    private val dataset: List<Specie>

) : RecyclerView.Adapter<SpeciesAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(val binding: ListSpecieBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ListSpecieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val specie = dataset[position]

        holder.binding.animalImage.setImageResource(specie.imageResource)
        holder.binding.speciesNameText.text = context.getString(specie.name)
        holder.binding.locationText.text = context.getString(specie.location)
        holder.binding.infoText.text = context.getString(specie.info)


//       you have to check first if the button isClicked or not, set the proper image-color/ image, because if not recycleView will use that value random later
//        for "Like-button //
        if (specie.isLiked) {
            holder.binding.likeButton.setImageResource(R.drawable.baseline_favorite_24)
        } else {
            holder.binding.likeButton.setImageResource(R.drawable.ic_heart_outlined)
        }

            holder.binding.likeButton.setOnClickListener {

                if (specie.isLiked) {
                    specie.isLiked = false
                    holder.binding.likeButton.setImageResource(R.drawable.ic_heart_outlined)
                } else {
                    specie.isLiked = true
                    holder.binding.likeButton.setImageResource(R.drawable.baseline_favorite_24)
                }
            }

    }

    override fun getItemCount(): Int {
       return dataset.size
    }
}