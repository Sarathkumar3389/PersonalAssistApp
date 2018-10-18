package com.example.aampal.personalassistantapp

import android.app.Activity
import android.support.design.widget.AppBarLayout
import android.view.View
import org.jetbrains.anko.design.tabLayout
import android.support.design.widget.TabLayout.MODE_FIXED

import android.view.Gravity.FILL
import org.jetbrains.anko.*
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.support.v4.viewPager



class  MainActivityUI : AnkoComponent<MainActivity>{

    companion object {
        var pagerID = 1
        var tabID = 2
    }

    override fun createView(ui: AnkoContext<MainActivity>): View =  with(ui) {

        coordinatorLayout{
            lparams(matchParent, matchParent)

            appBarLayout{
                lparams(matchParent, wrapContent)

                tabLayout{
                    id = tabID
                    lparams(matchParent, wrapContent) {
                        tabGravity = FILL
                        tabMode = MODE_FIXED
                    }
                }
            }

           viewPager{
                id = pagerID

            }.lparams(matchParent, matchParent)
            {
                behavior = AppBarLayout.ScrollingViewBehavior()
            }

        }

    }


}