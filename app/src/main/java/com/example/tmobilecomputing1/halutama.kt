package com.example.tmobilecomputing1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class halutama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halutama)

        findViewById<View>(R.id.Lihat1).setOnClickListener {
            val packageContext = Intent()
            val open = Intent(this, HalamanContent::class.java)
            startActivity(open)
        }

    }
}