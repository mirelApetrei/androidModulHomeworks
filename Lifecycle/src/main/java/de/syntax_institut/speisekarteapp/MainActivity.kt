package de.syntax_institut.speisekarteapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import de.syntax_institut.speisekarteapp.databinding.ActivityMainBinding
import kotlin.math.round

/** Main Activity, dient als Einstiegspunkt für die App */
val TAG = "MainActivity"


class MainActivity : AppCompatActivity() {

    /** Klassen Variablen  */
    private var bill: Float = 0f
    private val drink1 = Drink("Kaffee", 3.95f)
    private val drink2 = Drink("Wein", 4.20f)
    private val drink3 = Drink("Cocktail", 6.90f)

    /** Lifecycle Funktion, wird aufgerufen wenn Activity erstellt wird */
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        with this lines of code , can you the values save before you rotate the screen
        if (savedInstanceState != null){
            drink1.count = savedInstanceState.getInt("drink1", 0)
            drink2.count = savedInstanceState.getInt("drink2", 0)
            drink3.count = savedInstanceState.getInt("drink3", 0)
            bill = savedInstanceState.getFloat("price", 0f)
        }

        Log.d(TAG, "The app is initialized, we are in onCreate() method now...")
        Toast.makeText(this, "I`m in onCreate() method now.", Toast.LENGTH_SHORT).show()
        // Binding Variable
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )

        // Setzen des Namen, Preises und Count in der View über die binding Variable
        binding.drink1Name.text = drink1.name
        binding.drink2Name.text = drink2.name
        binding.drink3Name.text = drink3.name

        binding.drink1Price.text = "%.2f".format(drink1.price)
        binding.drink2Price.text = "%.2f".format(drink2.price)
        binding.drink3Price.text = "%.2f".format(drink3.price)

        binding.drink1Count.text = drink1.count.toString()
        binding.drink2Count.text = drink2.count.toString()
        binding.drink3Count.text = drink3.count.toString()
        binding.totalPrice.text = bill.toString()

        // onClicklistener für das Kaffee Icon
        binding.drink1Button.setOnClickListener {
            try {
                addToBill(drink1.price)
                drink1.count++
                binding.drink1Count.text = drink1.count.toString()
                binding.totalPrice.text = bill.toString()
            } catch (ex: Exception) {
                Log.e(TAG, "Something went wrong: $ex")
            }

        }

        //onClicklistener für das Wein Icon
        binding.drink2Button.setOnClickListener {
            try {
                addToBill(drink2.price)
                drink2.count++
                binding.drink2Count.text = drink2.count.toString()
                binding.totalPrice.text = bill.toString()
            } catch (ex: Exception) {
                Log.e(TAG, "Something went wrong: $ex")
            }
        }

        // onClicklistener für das Cocktail Icon
        binding.drink3Button.setOnClickListener {
            try {
                addToBill(drink3.price)
                drink3.count++
                binding.drink3Count.text = drink3.count.toString()
                binding.totalPrice.text = bill.toString()
            } catch (ex: Exception) {
                Log.e(TAG, "Something went wrong: $ex")
            }
        }

        // onClickListener für den ResetButton
        binding.resetButton.setOnClickListener {
            drink1.count = 0
            drink2.count = 0
            drink3.count = 0
            bill = 0f

            binding.drink1Count.text = drink1.count.toString()
            binding.drink2Count.text = drink2.count.toString()
            binding.drink3Count.text = drink3.count.toString()
            binding.totalPrice.text = "0.0"
        }
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "We are in onStart() method of the app Lifecycle.")
        Toast.makeText(this, "I`m in onStart() method now.", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "We are in onResume() method of the app Lifecycle.")
        Toast.makeText(this, "I`m in onResume() method now.", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "We are in onPause() method of the app Lifecycle.")
        Toast.makeText(this, "I`m in onPause() method now.", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.w(TAG, "We are in onStop() method of the app Lifecycle.")
        Toast.makeText(this, "I`m in onStop() method now.", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w(TAG, "We are in onDestroy() method of the app Lifecycle.")
        Toast.makeText(this, "I`m in onDestroy() method now.", Toast.LENGTH_SHORT).show()
    }

// with this method, yo can make saving of data possible
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt("drink1", drink1.count)
        outState.putInt("drink2", drink2.count)
        outState.putInt("drink3", drink3.count)
        outState.putFloat("price", bill)
    }




    /** Diese Funktion addiert den Preis zur Rechnung */
    private fun addToBill(price: Float?) {
        if (price != null) {
            bill += price
            bill = round(bill * 100) / 100
        }
    }
}
