package com.example.k1hw6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.k1hw6.databinding.ActivityMainBinding
import com.example.k1hw6.databinding.FragmentSecondBinding

class lessonFragment : Fragment() {

    class LessonFragment : Fragment() {
        private lateinit var binding: FragmentSecondBinding
        private lateinit var adapter: LessonAdapter
        private val data = arrayListOf<lesson>()
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            binding = FragmentSecondBinding.inflate(
                LayoutInflater.from(requireContext()),
                container,
                false
            )
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            loadData()
            adapter = LessonAdapter(data, {
                requireContext().showToast(it.toString())
            })
            binding.recycle.layoutManager = GridLayoutManager(requireContext(), 2)
            binding.recycle.adapter = adapter
        }

        private fun loadData() {
            data.add(
                lesson(
                    "Math",
                    "https://upload.wikimedia.org/wikipedia/commons/c/c3/Deus_mathematics.png",
                    R.color.dark_blue,
                    R.color.dark_blue_two
                )
            )
            data.add(
                lesson(
                    "History",
                    "https://i.pinimg.com/originals/0a/22/0f/0a220f2efde13db24c911e3f6870ccba.png",
                    R.color.red,
                    R.color.red_two
                )
            )
            data.add(
                lesson(
                    "Informatica",
                    "https://cdn-icons-png.flaticon.com/512/201/201560.png",
                    R.color.pink,
                    R.color.pink_two
                )
            )
            data.add(
                lesson(
                    "Biology",
                    "https://images.squarespace-cdn.com/content/v1/54a6bdb7e4b08424e69c93a1/1601982911320-BAEV36YZ558UNCQS05QJ/logo-DNA.png",
                    R.color.green,
                    R.color.green_two
                )
            )
            data.add(
                lesson(
                    "Chemistry",
                    "https://www.shareicon.net/data/512x512/2016/04/14/749410_education_512x512.png",
                    R.color.blue,
                    R.color.blue_two
                )
            )
            data.add(
                lesson(
                    "Geography",
                    "https://cdn-icons-png.flaticon.com/512/2784/2784487.png",
                    R.color.purple,
                    R.color.purple_two
                )
            )
            data.add(
                lesson(
                    "Literature",
                    "https://www.pngall.com/wp-content/uploads/2018/05/Books-PNG-File.png",
                    R.color.orange,
                    R.color.orange_two
                )
            )
            if (arguments != null){
                val lesson :lesson = arguments?.getSerializable("lesson") as lesson
                data.add(lesson)
            }
        }
    }
        }


