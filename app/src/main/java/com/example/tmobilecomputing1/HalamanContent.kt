package com.example.tmobilecomputing1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HalamanContent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_content)

        findViewById<View>(R.id.Instal).setOnClickListener {
            val url="https://play.google.com/store/apps/details?id=com.vectorunit.purple.googleplay&pcampaignid=web_share"
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            startActivity(intent)
        }
    }
}