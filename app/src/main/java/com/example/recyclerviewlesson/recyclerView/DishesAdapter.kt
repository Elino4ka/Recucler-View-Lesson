package com.example.recyclerviewlesson.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.RecyclerViewLesson.databinding.ItemDishBinding
import com.example.recyclerviewlesson.recyclerView.Dish
import com.example.recyclerviewlesson.recyclerView.DishViewHolder

class DishesAdapter(val dishes: List<Dish>) : RecyclerView.Adapter<DishViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        return DishViewHolder(ItemDishBinding.inflate(inflater, parent, false))
    }

    override fun getItemCount(): Int {
        return dishes.size
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        holder.bind(dishes[position])
    }
}