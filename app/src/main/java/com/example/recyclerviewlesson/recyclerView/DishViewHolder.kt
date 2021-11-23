package com.example.recyclerviewlesson.recyclerView

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.RecyclerViewLesson.databinding.ItemDishBinding

class DishViewHolder(val binding: ItemDishBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(dish: Dish) {
        with(binding) {
            tvName.text = dish.name
            tvDescription.text = dish.description
            tvPrice.text = dish.price.toString() + " ₽"
            ivPhoto.setImageDrawable(
                ContextCompat.getDrawable(
                    itemView.context,
                    dish.image
                )
            )
        }
    }
}