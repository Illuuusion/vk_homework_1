package com.vk_education_1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var button: Button
    private var rectanglesCount = "0"

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
            val list = (0..< savedInstanceState.getInt(rectanglesCount)).toList()
            adapter.setItems(list)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(rectanglesCount, adapter.itemCount);
    }
}