package com.danie.kotlinexamples

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById(R.id.nameEditText) as EditText
        val button = findViewById(R.id.button) as Button

        var text = nameEditText.text
        button.setOnClickListener {
            var welcomeText: String

            if (nameEditText.text.isNullOrBlank()) nameEditText.error = "Name can't be blank" else {
                welcomeText = "Hello ${nameEditText.text}!"
                Toast.makeText(this, welcomeText, Toast.LENGTH_LONG).show()
            }
        }
    }
}
