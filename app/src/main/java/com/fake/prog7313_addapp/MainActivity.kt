package com.fake.prog7313_addapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //link UI
        val editTextNumber1 = findViewById<EditText>(R.id.editTextNumber1)
        val editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val textViewOutput = findViewById<TextView>(R.id.textViewOutput)
        val buttonClear = findViewById<Button>(R.id.buttonClear)

        //for button click events
        buttonAdd.setOnClickListener{
            val num1 = editTextNumber1.text.toString().toIntOrNull() ?: 0
            val num2 = editTextNumber1.text.toString().toIntOrNull() ?: 0
            val sumResult = num1 + num2
            textViewOutput.text = "Sum = $sumResult"

        }

        buttonClear.setOnClickListener{
            editTextNumber1.text.clear()
            editTextNumber2.text.clear()
            textViewOutput.text = ""

        }

    }
}