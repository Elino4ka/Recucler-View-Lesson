package com.example.recyclerviewlesson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.RecyclerViewLesson.R
import com.example.RecyclerViewLesson.databinding.FragmentBlankBinding
import com.example.recyclerviewlesson.recyclerView.Dish
import com.example.recyclerviewlesson.recyclerView.DishesAdapter


class BlankFragment : Fragment() {

    lateinit var binding: FragmentBlankBinding

    companion object {
        const val DISHES_TYPE = "dishes type"
        fun newInstance(type: String): BlankFragment {
            return BlankFragment().apply {
                arguments = bundleOf(
                    DISHES_TYPE to type
                )
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvDishes.adapter = DishesAdapter(generateDishes())
        binding.rvDishes.layoutManager =
            LinearLayoutManager(requireContext())
    }

    private fun generateDishes(): MutableList<Dish> {
        when (getDishesType()) {
            "DESSERT" -> return mutableListOf(
                Dish(
                    "Десерт круассан\n" +
                            "с грецкими орехами", "Бульон из пряного говяжьего мясного супа с " +
                            "кокосовым молок...", 235, R.drawable.third_dish
                )
            )

            "FAST_FOOD" -> return mutableListOf(
                Dish(
                    "Том Ям суп с морепродуктами", "Бульон из пряного говяжьего мясного супа с " +
                            "кокосовым молок...", 195, R.drawable.first_dish
                ),
                Dish(
                    "Сет Филадельфия\n" +
                            "Party De Luxe",
                    "Лосось, огурец, авокадо, кунжут, сыр, зеленый лук, 6 " +
                            "шт",
                    199,
                    R.drawable.second_dish
                )
            )
            else -> return mutableListOf(
                Dish(
                    "Том Ям суп с морепродуктами", "Бульон из пряного говяжьего мясного супа с " +
                            "кокосовым молок...", 195, R.drawable.first_dish
                ),
                Dish(
                    "Сет Филадельфия\n" +
                            "Party De Luxe",
                    "Лосось, огурец, авокадо, кунжут, сыр, зеленый лук, 6 " +
                            "шт",
                    199,
                    R.drawable.second_dish
                ),
                Dish(
                    "Десерт круассан\n" +
                            "с грецкими орехами", "Бульон из пряного говяжьего мясного супа с " +
                            "кокосовым молок...", 235, R.drawable.third_dish
                )
            )
        }
    }

    private fun getDishesType(): String {
        return arguments?.getString(DISHES_TYPE, "ALL")!!
    }
}