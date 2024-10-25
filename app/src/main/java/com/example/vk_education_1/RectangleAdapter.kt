package com.lection.vk_homework_1

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vk_education_1.R

class RectangleAdapter() : RecyclerView.Adapter<RectangleViewHolder>() {

    private val items = ArrayList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RectangleViewHolder {
        Log.d("ADD", "onCreateViewHolder")
        return RectangleViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rectangle_view, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RectangleViewHolder, position: Int) {
        holder.bind(items[position])
        Log.d("ADD", "onBindViewHolder")
    }

    fun setItems(list: List<Int>) {
        items.clear()
        items.addAll(list)
        notifyItemRangeChanged(0, items.size)
    }

    fun addItems(item: Int) {
        items.add(item)
        notifyItemInserted(items.size)
    }
}