package com.lection.vk_homework_1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.vk_education_1.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var button: Button
    private var RECTANGLES_COUNT = "0"

    private val adapter = RectangleAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        button = findViewById(R.id.button)

        recyclerView.adapter = adapter

        button.setOnClickListener {
            adapter.addItems(adapter.itemCount)
        }

        if (savedInstanceState != null) {
            for (it in 0..< savedInstanceState.getInt(RECTANGLES_COUNT) - 1)
                adapter.addItems(it)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(RECTANGLES_COUNT, adapter.itemCount);
    }
}