package com.example.aampal.personalassistantapp

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MainPagerAdapter(fm: FragmentManager):FragmentPagerAdapter(fm){


    override fun getItem(p0: Int): Fragment? {
        return when(p0){
                0 -> FragmentCat1.newInstance()
                1 -> FragmentCat2.newInstance()
                2 -> FragmentCat3.newInstance()
                3 -> FragmentCat4.newInstance()
                else -> null
            }
    }
    override fun getCount(): Int {
        return 4
    }


}