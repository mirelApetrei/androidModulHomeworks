package com.syntax_institut.filmestreamingservice

import java.util.Comparator

/**
 * Diese Klasse liefert die Mediathek und enthält die Funktionalität zum Sortieren der Listen
 */
class Mediathek {

    /**
     * Diese Funktion liefert die Mediathek.
     * enthalten sind alle Filme
     */
    fun createDatabase(): MutableList<String> {

        // Eine Liste mit falschen Elementen
        val movieDatabase = mutableListOf(
            "San Andreas",
            "Black Panther",
            "The Goonies",
            "Ready Player One",
            "Tides",
            "The Mandalorian",
            "Black Widow",
            "Chapter Two",
            "The Matrix",
            "Titanic",
            "After",
            "Star Wars",
            "Iron Man",
            "Joker"
        )

        // TODO: Schreibe hier deinen Code
        movieDatabase.shuffle()
        return movieDatabase
    }

    /**
     * Diese Funktion sortiert die übergebende Liste alphabetisch
     */
    fun sortListAlphabetically(list: MutableList<String>): MutableList<String> {

        // TODO: Schreibe hier deinen Code
        list.sort()
        return list
    }

    /**
     * Diese Funktion sortiert die übergebene Liste nach Wortlänge
     */
    fun sortListTitleLength(list: MutableList<String>): MutableList<String> {

        // TODO: Schreibe hier deinen Code
        val selector: (String) -> Int = { str -> str.length }
        list.sortBy(selector)
        return list
    }

    /**
     * Diese Funktion invertiert die Reihenfolge der Liste
     */
    fun invertList(list: MutableList<String>): MutableList<String> {

        // TODO: Schreibe hier deinen Code
        list.reverse()

        return list
    }

    /**
     * Diese Funktion löscht den übergebenen Titel aus der Mediathek
     */
    fun deleteFromDatabase(database: MutableList<String>, title: String): MutableList<String> {

        // TODO: Schreibe hier deinen Code
        database.remove(title)
        return database
    }

    /**
     * Diese Funktion fügt den übergebenen Titel an erster Stelle zu den Favoriten hinzu
     */
    fun addToFavorites(favorites: MutableList<String>, title: String): MutableList<String> {

        // TODO: Schreibe hier deinen Code
        favorites.add(0, title)
        return favorites
    }
}
