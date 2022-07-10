package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var uname: TextView
    lateinit var pswrd: TextView
    lateinit var butn: Button





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        butn = findViewById(R.id.button)
        butn.setOnClickListener {

            Toast.makeText(this, "You have successfully signed up", Toast.LENGTH_SHORT).show()
        }
    }

}
