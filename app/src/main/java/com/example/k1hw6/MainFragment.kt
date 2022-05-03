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
    lateinit var binding: FragmentMaiBinding
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMaiBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root
        return super.onCreateView(inflater, container, savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val  lesson = lesson()
        super.onViewCreated(view, savedInstanceState)
        binding.add.setOnClickListener {
            if (binding.add.text.isNotEmpty()){
                lesson.lesson = binding.textColor.text.toString()

            }else{

            }
        }
        with(binding) {
            color.setOnClickListener {
                val alertDialog = AlertDialog.Builder(requireContext())
                alertDialog.setTitle("Add color").setItems(R.array.color)
                { p0, pos ->
                    when (pos) {
                        0 -> {
                            lesson.color = R.color.red
                            color.setText("Red")

                        }
                        1 -> {
                            lesson.color = R.color.green
                            color.setText("Green")

                        }
                        2 -> {
                            lesson.color = R.color.orange
                            color.setText("Orange")
                        }
                    }}.create().show()
                           binding.textColor.setOnClickListener {
                                val alertDialog = AlertDialog.Builder(requireContext())
                                alertDialog.setTitle("Add color").setItems(R.array.color)
                                { p0, pos ->
                                    when (pos) {
                                        0 -> {
                                            lesson.color = R.color.red_two

                                            textColor.setText("Red")

                                        }
                                        1 -> {
                                            lesson.color = R.color.green_two

                                            textColor.setText("Green")

                                        }
                                        2 -> {
                                            lesson.color = R.color.orange_two

                                            textColor.setText("Orange")
                                        }
                                    }
                }.create().show()
            }

                }
            }
        }
    }




