package com.example.aampal.personalassistantapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.setContentView

class UpdateActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val ui = UpdateActivityUI()
        ui.setContentView(this)
    }
}