package com.example.aampal.personalassistantapp

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View
import org.jetbrains.anko.setContentView


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val ui = MainActivityUI()
        ui.setContentView(this)

        val tabLayout : TabLayout = findViewById(MainActivityUI.tabID)
        val viewPager : ViewPager = findViewById(MainActivityUI.pagerID)

        // Initialize the MoviesPagerAdapter and Set the Adapter and
        viewPager!!.adapter = MainPagerAdapter(supportFragmentManager)
        // the TabLayout for the ViewPager
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)?.setText(R.string.Category1)
        tabLayout.getTabAt(1)?.setText(R.string.Category2)
        tabLayout.getTabAt(2)?.setText(R.string.Category3)
        tabLayout.getTabAt(3)?.setText(R.string.Category4)



    }

}