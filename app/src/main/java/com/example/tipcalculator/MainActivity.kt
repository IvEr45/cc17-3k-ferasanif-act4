package com.example.tipcalculator

import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {
    private lateinit var amount:EditText
    private lateinit var calculate:Button
    private lateinit var result: TextView
    private lateinit var radioGroup: RadioGroup
    private lateinit var switch: Switch


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        amount = findViewById(R.id.editTextText)
        switch = findViewById(R.id.switch1)
        radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        calculate = findViewById(R.id.button)
        result = findViewById(R.id.textView2)

        amount.inputType = InputType.TYPE_CLASS_NUMBER


        calculate.setOnClickListener {
           val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            if (selectedRadioButtonId == -1 || amount.text.isEmpty()) {
                Toast.makeText(this, "Please select an option and/or input an amount", Toast.LENGTH_SHORT).show()

            }else{
                when (selectedRadioButtonId) {
                    R.id.radioButton -> {
                        val inputText = amount.text.toString()
                        val number = inputText.toInt()
                        val formula =  number * 0.2
                        if (switch.isChecked) {
                            result.text = "Tip amount: ${ceil(formula)}"
                        }else{
                            result.text = "Tip amount: $formula"
                        }
                    }
                    R.id.radioButton2 -> {
                        val inputText = amount.text.toString()
                        val number = inputText.toInt()
                        val formula =  number * 0.2
                        if (switch.isChecked) {
                            result.text = "Tip amount: ${ceil(formula)}"
                        }else{
                            result.text = "Tip amount: $formula"
                        }
                    }
                    R.id.radioButton3 -> {
                        val inputText = amount.text.toString()
                        val number = inputText.toInt()
                        val formula =  number * 0.2
                        if (switch.isChecked) {
                            result.text = "Tip amount: ${ceil(formula)}"
                        }else{
                            result.text = "Tip amount: $formula"
                        }
                    }
                }
            }

        }

    }

}