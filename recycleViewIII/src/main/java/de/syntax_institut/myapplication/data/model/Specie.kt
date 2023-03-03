package de.syntax_institut.myapplication.data.model

data class Specie(
    val name: Int,
    val location: Int,
    val imageResource: Int,
    val info: Int,
    var isLiked: Boolean = false
) {
}