package de.syntax_institut.pizza

import android.annotation.SuppressLint
import android.widget.ImageView
import android.widget.TextView

class PizzaBiancaCheese(val cheese: String = "Cheese") : PizzaBianca() {

    override fun bake(image: ImageView) {
        image.setImageResource(R.drawable.pizza_bianca_kaese)
    }


    @SuppressLint("SetTextI18n")
    override fun ingredients(
        text1: TextView,
        text2: TextView,
        text3: TextView
    ) {
        text1.text = "$flour $water $yeast"
        text2.text = ricotta
        text3.text = cheese
    }
}