package com.example.k1hw6

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.example.k1hw6.databinding.FragmentMaiBinding

class MaiFragment : Fragment() {
    private lateinit var binding: FragmentMaiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            FragmentMaiBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val lesson = lesson(
            color = R.color.orange, textColor = R.color.green_two,
            image = "https://images.squarespace-cdn.com/content/v1/52d62550e4b09a1f1b0861f1/1601589219654-9WEKGL2A5A2OO8X0PART/curriculum.png"
        )
        binding.add.setOnClickListener {
            if (binding.lessonTitle.text.isEmpty()) {
                requireContext().showToast("Title can't be empty")
            } else {
                lesson.lesson = binding.lessonTitle.text.toString()
                val fragment = lessonFragment.LessonFragment()
                val bundle = Bundle()
                bundle.putSerializable("lesson", lesson)
                fragment.arguments = bundle
                requireActivity().replaceFragment(fragment)

            }
        }

        binding.color.setOnClickListener {
            showAlert("Выбор цвета",R.array.color){
                val item = resources.getStringArray(R.array.color)[it]
                binding.color.setText(item)
                when (it) {
                    0 -> {
                        lesson.color = R.color.red_two
                        binding.color.setText("Red")
                    }
                    1 -> {
                        lesson.color = R.color.green_two
                        binding.color.setText("Green")
                    }
                    2 -> {
                        lesson.color = R.color.orange_two
                        binding.color.setText("Orange")
                    }
                }
            }
        }

        binding.textColor.setOnClickListener {
            showAlert("Выбор цвета", R.array.color){
                val item = resources.getStringArray(R.array.color)[it]
                binding.textColor.setText(item)
                when (it) {
                    0 -> {
                        lesson.textColor = R.color.red_two
                        binding.textColor.setText("Red")
                    }
                    1 -> {
                        lesson.textColor = R.color.green_two
                        binding.textColor.setText("Green")
                    }
                    2 -> {
                        lesson.textColor = R.color.orange_two
                        binding.textColor.setText("Orange")
                    }
                }
            }

        }



    }

}