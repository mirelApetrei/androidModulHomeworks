package de.syntax_institut.filmestreamingservice.data

import android.content.Context
import de.syntax_institut.filmestreamingservice.R
import de.syntax_institut.filmestreamingservice.data.model.Movie
import kotlin.random.Random

/**
 * Diese Klasse bereitet Daten aus den Ressourcen auf
 */
class Datasource(private val context: Context) {

    private val nrOfImages = 21 // anpassen, wenn Anzahl an Bildern geändert wurde
    private val numberOfTitles = 21 // anpassen, wenn Anzahl an Filmtiteln geändert wurde

    /**
     * Diese Funktion holt die Titel & Bilder aus der Quelldatei
     * und liefert eine Liste aus Filmen zurück
     */
    fun loadMovies(): List<Movie> {
//         Die Filmliste
//         Liefere die Liste zurück
//         TODO Schreibe hier deinen Code

        return listOf(
            Movie(R.string.movieTitle1, R.drawable.film_1),
            Movie(R.string.movieTitle2, R.drawable.film_2),
            Movie(R.string.movieTitle3, R.drawable.film_3),
            Movie(R.string.movieTitle4, R.drawable.film_4),
            Movie(R.string.movieTitle5, R.drawable.film_5),
            Movie(R.string.movieTitle6, R.drawable.film_6),
            Movie(R.string.movieTitle7, R.drawable.film_7),
            Movie(R.string.movieTitle8, R.drawable.film_8),
            Movie(R.string.movieTitle9, R.drawable.film_9),
            Movie(R.string.movieTitle10, R.drawable.film_10),
            Movie(R.string.movieTitle11, R.drawable.film_11),
            Movie(R.string.movieTitle12, R.drawable.film_12),
            Movie(R.string.movieTitle13, R.drawable.film_13),
            Movie(R.string.movieTitle14, R.drawable.film_14),
            Movie(R.string.movieTitle15, R.drawable.film_15),
            Movie(R.string.movieTitle16, R.drawable.film_16),
            Movie(R.string.movieTitle17, R.drawable.film_17),
            Movie(R.string.movieTitle18, R.drawable.film_18),
            Movie(R.string.movieTitle19, R.drawable.film_19),
            Movie(R.string.movieTitle20, R.drawable.film_20),
            Movie(R.string.movieTitle21, R.drawable.film_21)
        )
    }


   /* fun loadMovies(): List<Movie>{
        val movies = mutableListOf<Movie>()
        for (i in 0..numberOfTitles){
            var title = getTitle(i)
            var image = getImage()
            var movie = Movie(title, image)
            movies.add(movie)
        }
        return movies
    }

*/
    /**
     * Diese Funktion liefert den Titel Nummer index aus der Quelle
     */
    private fun getTitle(index: Int): Int {
        return context.resources.getIdentifier(
            "movieTitle$index",
            "string",
            context.packageName
        )
    }

    private var iPrevious = 0
    /**
     * Diese Funktion liefert ein zufälliges Bild aus der Bilderquelle
     */
    private fun getImage(): Int {
        var i: Int
        // kein Bild soll zweimal hintereinander kommen
        while (true) {
            i = Random.nextInt(1, nrOfImages + 1)
            if (iPrevious != i) {
                iPrevious = i
                break
            }
        }
        // Liefere das entsprechende Bild aus der Quelle
        return context.resources.getIdentifier(
            "film_$i",
            "drawable",
            context.packageName
        )
    }
}
