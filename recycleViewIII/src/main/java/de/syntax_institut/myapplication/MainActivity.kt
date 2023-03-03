package de.syntax_institut.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import de.syntax_institut.myapplication.adapter.SpeciesAdapter
import de.syntax_institut.myapplication.data.Datasource
import de.syntax_institut.myapplication.databinding.ActivityMainBinding


// Seltene Tiere-App -> Rare Animals
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val species = Datasource().loadSpecie()

        binding.speciesRecycler.adapter = SpeciesAdapter(this, species)
        binding.speciesRecycler.setHasFixedSize(true)


//        This is for image-change...
        val snapHelper: SnapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(binding.speciesRecycler)
    }
}