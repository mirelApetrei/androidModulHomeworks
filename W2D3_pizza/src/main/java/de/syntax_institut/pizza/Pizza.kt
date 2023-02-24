package de.syntax_institut.pizza

import android.annotation.SuppressLint
import android.widget.ImageView
import android.widget.TextView


open class Pizza(
    val flour: String = "Flour",
    val water: String = "Water",
    val yeast: String = "Yeast"
) {


    open fun bake(image: ImageView) {
        image.setImageResource(R.drawable.teig)
    }

    @SuppressLint("SetTextI18n")
    open fun ingredients(
        text1: TextView,
        text2: TextView,
        text3: TextView
    ) {

        text1.text = "$flour $water $yeast"
        text2.text = " "
        text3.text = " "
    }
}


/*yeast = Hefe = Drojdie*/