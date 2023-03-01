package de.syntax_institut.pizza

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Main Activity, dient als Einstiegspunkt für die App
 */
class MainActivity : AppCompatActivity() {

    /**
     * Lifecycle Methode, wird aufgerufen wenn Activity erstellt wird dss
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hole die benötigte ImageView und die drei benötigten TextViews aus dem Layout
        val ivPizza = findViewById<ImageView>(R.id.ivPizza)
        val zeile1 = findViewById<TextView>(R.id.tvZutaten1)
        val zeile2 = findViewById<TextView>(R.id.tvZutaten2)
        val zeile3 = findViewById<TextView>(R.id.tvZutaten3)

        /* setze einen onClickListener für jeden Button, innerhalb des Listeners wird ein Objekt
        der entsprechenden Pizzaklasse erstellt und beide Funktionen aufgerufen */

                    // Listener für Klasse Pizza
                    // TODO: Schreibe hier deinen Code
                    // get reference to the pizza_button
        val pizza_button = findViewById<Button>(R.id.btnPizza)
        //set on_click Listener
        pizza_button.setOnClickListener {
            val pizza: Pizza = Pizza()
            pizza.bake(ivPizza)
            pizza.ingredients(zeile1, zeile2, zeile3)
        }

                    // Listener für Klasse PizzaBianca
                    // TODO: Schreibe hier deinen Code
        val bianca_button = findViewById<Button>(R.id.btnBianca)
        bianca_button.setOnClickListener {
            val bianca = PizzaBianca()
            bianca.bake(ivPizza)
            bianca.ingredients(zeile1, zeile2, zeile3)
        }

                // Listener für Klasse PizzaRossa
                // TODO: Schreibe hier deinen Code
        val rossa_button = findViewById<Button>(R.id.btnRossa)
        rossa_button.setOnClickListener {
            val rossa = PizzaRossa()
            rossa.bake(ivPizza)
            rossa.ingredients(zeile1, zeile2, zeile3)
        }

                    // Listener für Klasse PizzaBiancaKaese
                    // TODO Schreibe hier deinen Code

        val kaese_button = findViewById<Button>(R.id.btnBiancaKaese)
        kaese_button.setOnClickListener {
            val kaese = PizzaBiancaCheese()
            kaese.bake(ivPizza)
            kaese.ingredients(zeile1, zeile2, zeile3)
        }

                // Listener für Klasse PizzaBiancaRucola
                // TODO Schreibe hier deinen Code

        val rucola_button = findViewById<Button>(R.id.btnBiancaRucola)
        rucola_button.setOnClickListener {
            val rucola = PizzaBiancaRucola()
            rucola.bake(ivPizza)
            rucola.ingredients(zeile1, zeile2, zeile3)
        }

                // Listener für Klasse PizzaRossaSalami
                // TODO Schreibe hier deinen Code
        val salami_button = findViewById<Button>(R.id.btnRossaSalami)
        salami_button.setOnClickListener {
            val salami = PizzaRossaSalami()
            salami.bake(ivPizza)
            salami.ingredients(zeile1, zeile2, zeile3)
        }

                // Listener für Klasse PizzaRossaHawaii
                // TODO Schreibe hier deinen Code
        val hawaii_button = findViewById<Button>(R.id.btnRossaHawaii)
        hawaii_button.setOnClickListener {
            val hawaii = PizzaRossaHawaii()
            hawaii.bake(ivPizza)
            hawaii.ingredients(zeile1, zeile2, zeile3)
        }

    }
}
