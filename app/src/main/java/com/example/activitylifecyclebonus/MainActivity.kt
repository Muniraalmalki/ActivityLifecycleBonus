package com.example.activitylifecyclebonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var tvMain:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvMain = findViewById(R.id.tvMain)
    }

    override fun onResume() {
        super.onResume()
        tvMain.text = "${tvMain.text}Online \n"
    }

    override fun onStop() {
        super.onStop()
        tvMain.text = "${tvMain.text}Last seen ${Calendar.getInstance().time}\n"
    }
}