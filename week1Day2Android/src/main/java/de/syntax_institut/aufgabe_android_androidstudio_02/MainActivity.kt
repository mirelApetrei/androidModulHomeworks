package de.syntax_institut.aufgabe_android_androidstudio_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Countdownvariablen
    private lateinit var countDownTimer: CountDownTimer
    private var countNr: Int = 6

    /**
     * Die Lifecycle onCreate Methode
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countdown()
    }

    /**
     * Die Countdown Methode
     */
    private fun countdown() {
        countDownTimer = object : CountDownTimer(5000, 1000) {
            override fun onTick(p0: Long) {
                countNr--
                findViewById<TextView>(R.id.countDownTimer).text = countNr.toString()
            }

            override fun onFinish() {
                findViewById<TextView>(R.id.countDownTimer).visibility = View.GONE
                findViewById<TextView>(R.id.tv_app_startet).visibility = View.GONE
                findViewById<TextView>(R.id.tv_funktioniert).visibility = View.VISIBLE
            }
        }.start()
    }
}