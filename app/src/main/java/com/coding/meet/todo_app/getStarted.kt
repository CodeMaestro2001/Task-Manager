package com.coding.meet.todo_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class getStarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)


        val BUTTON3= findViewById<Button>(R.id.button3)
        BUTTON3.setOnClickListener {
            val Intent= Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }
    }
}