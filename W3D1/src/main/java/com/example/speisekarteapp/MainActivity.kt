package com.example.speisekarteapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.speisekarteapp.databinding.ActivityMainBinding
import kotlin.math.round


/** Main Activity, dient als Einstiegspunkt für die App */
val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    /** Klassen Variablen **/
    private var bill: Float = 0f
    private val drink1 = Drink("Kaffee", 3.95f)
    private val drink2 = Drink("Wein", 4.20f)
    private val drink3 = Drink("Cocktail", 6.90f)


    /** Lifecycle Funktion, wird aufgerufen wenn Activity erstellt wird */
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO Schreibe hier deinen Code

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.drink1Button.setOnClickListener {
            try{
                binding.drink1Name.text = drink1.name
                binding.drink1Price.text = drink1.price.toString()
                drink1.count += 1
                binding.drink1Count.text = drink1.count.toString()
                addToBill(drink1.price)
                binding.totalPrice.text = bill.toString()
            }catch (e:Exception){
                Log.e(TAG, "No more ${drink1.name} available")
            }

        }

        binding.drink2Button.setOnClickListener {
            try{
                binding.drink2Name.text = drink2.name
                binding.drink2Price.text = drink2.price.toString()
                drink2.count += 1
                binding.drink2Count.text = drink2.count.toString()
                addToBill(drink2.price)
                binding.totalPrice.text = bill.toString()
            } catch (e: Exception){
                Log.e(TAG, "No more ${drink2.name} available")
            }
        }

        binding.drink3Button.setOnClickListener {
           try {

                binding.drink3Name.text = drink3.name
                binding.drink3Price.text = drink3.price.toString()
                drink3.count += 1
                binding.drink3Count.text = drink3.count.toString()
                addToBill(drink3.price).toString()
                binding.totalPrice.text = bill.toString()
            } catch (e: Exception){
                Log.e(TAG, "No more ${drink3.name} available")
            }
        }

//    TODO: Bonus -> zurücksetzen button



        binding.resetButton.setOnClickListener {
            drink1.count = 0
            drink2.count = 0
            drink3.count = 0
            bill = 0f
            binding.totalPrice.text = "%.2f".format(bill)
            binding.drink1Count.text = drink1.count.toString()
            binding.drink2Count.text = drink2.count.toString()
            binding.drink3Count.text = drink3.count.toString()

        }

    }

    /** Diese Funktion addiert den Preis zur Rechnung */
    private fun addToBill(price: Float?) {
        if (price != null) {
            bill += price
            bill = round(bill * 100) / 100
        }
    }


}