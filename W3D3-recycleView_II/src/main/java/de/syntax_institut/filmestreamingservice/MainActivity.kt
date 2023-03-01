package de.syntax_institut.filmestreamingservice

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import de.syntax_institut.filmestreamingservice.adapter.ItemAdapter
import de.syntax_institut.filmestreamingservice.data.Datasource
import de.syntax_institut.filmestreamingservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    /**
     * Die lifecycle onCreate Methode
     */
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // recyclerView von Layout wird mit code verknüpft
        val recyclerView = binding.recyclerView

        // Liste aus Filmtiteln wird von der Datasource geladen
        // TODO Schreibe hier deinen Code
        val movies = Datasource(this@MainActivity).loadMovies()

        // recyclerView bekommt einen LayoutManager
        // TODO Schreibe hier deinen Code
        val recycleView = binding.recyclerView

        // ItemAdapter wird als Adapter festgelegt
        // TODO Schreibe hier deinen Code
        recycleView.adapter = ItemAdapter(this, movies)

        // verbesserte Performance bei fixer Größe
        recyclerView.setHasFixedSize(true)


    }
}