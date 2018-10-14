package com.example.aampal.personalassistantapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.support.v4.UI
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class FragmentCat4: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val ui = UI {

            verticalLayout{
                textView("Testing")
                textView("Testing1")
                textView("Testing2")
            }
        }


        return ui.view
    }

    companion object {
        fun newInstance():FragmentCat4{
            return FragmentCat4()
        }
    }


}