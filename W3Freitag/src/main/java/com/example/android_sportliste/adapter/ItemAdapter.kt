package com.example.android_sportliste.adapter

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.android_sportliste.R
import com.example.android_sportliste.data.model.Tennismen
import com.example.android_sportliste.databinding.CardDesignBinding

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Tennismen>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: CardDesignBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var cardView: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = CardDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val tennismen = dataset[position]

        holder.binding.flag.setImageResource(tennismen.flag)
        holder.binding.rank.text = context.getString(tennismen.rank)
        holder.binding.playerName.text = context.getString(tennismen.name)
        holder.binding.score.text = context.getString(tennismen.points)


//        toast messages every time you push a card
        holder.cardView.setOnClickListener {

            Toast.makeText(context,
                "You pressed on ${ holder.binding.playerName.text  } card info.\n He has ${holder.binding.score.text} points. ",
                Toast.LENGTH_LONG).show()


//            this is a new way to set Toast messages, but needs more attention

           /* Toast(this.context).apply {
                duration = Toast.LENGTH_LONG
                setGravity(Gravity.BOTTOM, 0, 0)
                setText("You pressed on ${holder.binding.playerName.text} card info.\n He has ${holder.binding.score.text} points. ")
            }.show()*/
        }
    }


    override fun getItemCount(): Int {
        return dataset.size
    }
}