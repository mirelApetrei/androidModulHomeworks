package de.syntax_institut.pizza

import android.annotation.SuppressLint
import android.widget.ImageView
import android.widget.TextView

open class PizzaRossa(val tomato: String = "Tomato Sauce") : Pizza() {

    override fun bake(image: ImageView) {
        image.setImageResource(R.drawable.pizza_rossa)
    }


    @SuppressLint("SetTextI18n")
    override fun ingredients(
        text1: TextView,
        text2: TextView,
        text3: TextView
    ) {
        text1.text = "$flour $water $yeast"
        text2.text = tomato
        text3.text = " "
    }
}