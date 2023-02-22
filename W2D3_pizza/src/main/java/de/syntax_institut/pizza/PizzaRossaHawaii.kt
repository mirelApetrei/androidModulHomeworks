package de.syntax_institut.pizza

import android.annotation.SuppressLint
import android.widget.ImageView
import android.widget.TextView

class PizzaRossaHawaii(val ham: String = "Ham", val pineaple: String = "Pineapple") : PizzaRossa() {

    override fun bake(image: ImageView) {
        image.setImageResource(R.drawable.pizza_rossa_hawaii)
    }


    @SuppressLint("SetTextI18n")
    override fun ingredients(
        text1: TextView,
        text2: TextView,
        text3: TextView
    ) {
        text1.text = "$flour $water $yeast"
        text2.text = tomato
        text3.text = "$ham $pineaple"
    }
}