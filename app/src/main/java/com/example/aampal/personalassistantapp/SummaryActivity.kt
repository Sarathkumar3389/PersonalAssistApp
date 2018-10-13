package com.example.aampal.personalassistantapp

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.setContentView

class SummaryActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val ui = SummaryActivityUI()
        ui.setContentView(this)
    }
}