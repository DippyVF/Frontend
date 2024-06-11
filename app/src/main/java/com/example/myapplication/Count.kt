package com.example.myapplication

import android.annotation.SuppressLint
import android.view.View
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Count(val items: List<Items>, val context: Context): RecyclerView.Adapter<Count.Element>() {
    class Element(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.textView1)
        val description: TextView = view.findViewById(R.id.textView2)
        val prise: TextView = view.findViewById(R.id.textView3)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Element {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.items_activity, parent, false)
        return Element(view)
    }

    override fun getItemCount(): Int {
    return items.count()
    }

    override fun onBindViewHolder(holder: Element, position: Int) {
        holder.title.text = items[position].title
        holder.description.text = items[position].description
        holder.prise.text = items[position].price.toString()
    }

}