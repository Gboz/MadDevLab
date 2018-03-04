package com.github.gboz.maddevlab

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_enter_menu.setOnClickListener({
            val intent = Intent(this, TrialsActivity::class.java)
            startActivity(intent)
        })

        btn_source_on_github.setOnClickListener({
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Gboz/MadDevLab")));
        })
    }



}
