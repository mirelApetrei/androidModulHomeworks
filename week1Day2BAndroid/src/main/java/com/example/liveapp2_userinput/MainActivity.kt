package com.example.liveapp2_userinput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generateButton = findViewById<Button>(R.id.generate_button)

        generateButton.setOnClickListener {
            generateGreeting()
        }
    }

    private fun generateGreeting() {
        //holen unsere Elmente aus dem Layout
        val firstNameView = findViewById<EditText>(R.id.first_name_edit)
        val lastNameView = findViewById<EditText>(R.id.last_name_edit)
        val politeSwitch = findViewById<Switch>(R.id.polite_switch)

        val greetingText = findViewById<TextView>(R.id.greeting_text)

        //Speichern die Eingaben des Layouts
        val firstName: String = firstNameView.text.toString()
        val lastName: String = lastNameView.text.toString()
        val polite: Boolean = politeSwitch.isChecked

        //Wir rufen Funktion auf mit unseren gespeicherten Eingaben
        greetingText.text = makeText(firstName, lastName, polite)
    }

    private fun makeText(firstName: String, lastName: String, polite: Boolean) : String {
        var resultText: String = ""

        if (polite) {
            resultText = getString(R.string.greeting_polite, firstName, lastName)
        } else {
            resultText = getString(R.string.greeting, firstName)
        }

        return resultText
    }

}