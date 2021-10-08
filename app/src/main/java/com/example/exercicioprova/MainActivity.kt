package com.example.exercicioprova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var calculateButton : Button = findViewById(R.id.calculateButton)
        var value1 : EditText = findViewById(R.id.firstValue)
        var value2 : EditText = findViewById(R.id.secondValue)

        calculateButton.setOnClickListener{
            var result : TextView = findViewById(R.id.resultText)
            var sum =  value1.text.toString().toDouble() + value2.text.toString().toDouble()
            result.text = result.text.toString()+"Resultado: "+sum.toString()
//                "Resultado: "+sum.toString()
        }
    }



}