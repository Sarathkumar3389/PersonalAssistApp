package com.example.aampal.personalassistantapp

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.support.v4.UI

class FragmentCat1: Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val name = arguments!!.getString("NameKEY")
        val rate = arguments!!.getInt("RateKEY")

        val list : ArrayList<item1> = arrayListOf()
        list.add(item1(name, rate, "Done"))
        list.add(item1("Pen", 1, "Done"))
        list.add(item1("Pen", 1, "Done"))

        val ui = UI {
            verticalLayout{

                recyclerView{
                    val orientation = LinearLayoutManager.VERTICAL
                    layoutManager = LinearLayoutManager(context, orientation, false)
                    adapter = Row1Adapter(list)
               }

                recyclerView{
                    val orientation = LinearLayoutManager.VERTICAL
                    layoutManager = LinearLayoutManager(context, orientation, false)
                    adapter = Row1Adapter(list)
                }

                recyclerView{
                    val orientation = LinearLayoutManager.VERTICAL
                    layoutManager = LinearLayoutManager(context, orientation, false)
                    adapter = Row1Adapter(list)
                }

            }
        }

        return ui.view
    }

    companion object {

        fun newInstance():FragmentCat1{

            val args = Bundle()
            args.putString("NameKEY","Orange")
            args.putInt("RateKey",200)

            val fragment = FragmentCat1()
            fragment.arguments = args
            return fragment
        }
    }
}

data class item1(var name: String, var rate: Int, var status: String)

class Row1Adapter(val list:ArrayList<item1> = ArrayList()): RecyclerView.Adapter<Row1Adapter.Row1ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Row1ViewHolder {
        return Row1ViewHolder(RowUI().createView(AnkoContext.create(p0.context,p0)))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: Row1ViewHolder, p1: Int) {
        val item = list[p1]
        p0.name.text = item.name
        p0.rate.text = item.rate.toString()
        p0.status.text = item.status
    }

    inner class Row1ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(RowUI.att1ID)
        var rate: TextView = itemView.findViewById(RowUI.att2ID)
        var status: TextView = itemView.findViewById(RowUI.att3ID)
    }
}

// Each row views
class RowUI : AnkoComponent<ViewGroup> {

    companion object {
        const val att1ID = 1
        const val att2ID = 2
        const val att3ID = 3

    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui){
        relativeLayout{

            lparams(matchParent, wrapContent)
            textView {
                id = att1ID
                text = "Sherlock"
                textColor = Color.BLACK
            }.lparams(wrapContent, wrapContent) {
                alignParentLeft()
            }

            textView {
                id = att2ID
                text = "2009"
            }.lparams(wrapContent, wrapContent) {
                rightOf(att1ID)
                leftMargin = dip(20)
            }

            textView {
                id = att3ID
                text = "2009"
            }.lparams(wrapContent, wrapContent) {
                rightOf(att2ID)
                leftMargin = dip(20)
            }

        }
    }
}
