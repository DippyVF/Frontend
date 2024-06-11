package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val item: RecyclerView = findViewById(R.id.recyclerViewAct)
        val items = arrayListOf<Items>()

        items.add(Items("","",1200))
        items.add(Items("","",400))
        items.add(Items("","",600))
        items.add(Items("","",1200))
        items.add(Items("","",1200))
        items.add(Items("","",1200))
        items.add(Items("","",1200))
        items.add(Items("","",1200))

    }
}