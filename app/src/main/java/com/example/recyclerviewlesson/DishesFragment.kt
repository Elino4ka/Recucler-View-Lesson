package com.example.recyclerviewlesson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.example.RecyclerViewLesson.databinding.FragmentDishesBinding



class DishesFragment : Fragment() {
    lateinit var binding: FragmentDishesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDishesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vpMain.adapter = ViewPagerAdapter(requireActivity()).apply {
            addFragment(BlankFragment.newInstance("ALL"))
            addFragment(BlankFragment.newInstance("FAST_FOOD"))
            addFragment(BlankFragment.newInstance("DESSERT"))
        }

        val foodTabNames = listOf("Всё", "Фаст-фуд", "Десерты")

        TabLayoutMediator(binding.tabs, binding.vpMain) { tab, position ->
            tab.text = foodTabNames[position]
        }.attach()
    }
}