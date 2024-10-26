package com.vk_education_1

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RectangleViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val text = view.findViewById<TextView>(R.id.textView)
    val image = view.findViewById<ImageView>(R.id.imageView)

    fun bind(number: Int) {
        text.text = number.toString()
        image.setBackgroundColor(
            if (number.mod(2) == 0)
                Color.RED
            else
                Color.BLUE
        )
    }

}