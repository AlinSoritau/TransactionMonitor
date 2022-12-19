package com.transactionmonitor

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onRegisterBtnClick(view: View) {
        val firstName = findViewById<EditText>(R.id.textFirstName)
        val lastName = findViewById<EditText>(R.id.textLastName)
        val email = findViewById<EditText>(R.id.textEmail)

        val errorTooltip = findViewById<TextView>(R.id.errorTooltip)
        val errorMessage = "Error: the parameter {} is required!"

        if (firstName.text.isNullOrBlank()) {
            errorTooltip.visibility = View.VISIBLE
            errorTooltip.text = errorMessage.replace("{}", "First Name")
        } else if (lastName.text.isNullOrBlank()) {
            errorTooltip.visibility = View.VISIBLE
            errorTooltip.text = errorMessage.replace("{}", "Last Name")
        } else if (email.text.isNullOrBlank()) {
            errorTooltip.visibility = View.VISIBLE
            errorTooltip.text = errorMessage.replace("{}", "Email")
        }
        else {
            errorTooltip.visibility = View.INVISIBLE
            findViewById<TextView>(R.id.textSetFirstName).text = firstName.text
            findViewById<TextView>(R.id.textSetLastName).text = lastName.text
            findViewById<TextView>(R.id.textSetEmail).text = email.text
        }
    }
}