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

    fun onBtnClick(view: View) {
        val greetingText = findViewById<TextView>(R.id.textView)
        val username = findViewById<EditText>(R.id.editTextTextPersonName)
        greetingText.text = username.text.toString()
    }
}