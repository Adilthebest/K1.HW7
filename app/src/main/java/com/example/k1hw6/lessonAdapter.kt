package com.example.k1hw6

import android.content.Context
import android.content.DialogInterface
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.k1hw6.databinding.FragmentSecondBinding
import com.example.k1hw6.databinding.ItemLessonBinding

        class lessonAdapter(private val data :ArrayList<lesson>, private val listener:View.OnClickListener) : RecyclerView.Adapter<lessonAdapter.LessonViewHolder>() {


            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
                return LessonViewHolder(
                    ItemLessonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                )
            }

            override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
                return holder.bind(data.get(position))
                holder.itemView.setOnClickListener{
                }
            }

            override fun getItemCount(): Int = data.size


            inner class LessonViewHolder(private val binding: ItemLessonBinding) :
                RecyclerView.ViewHolder(binding.root) {

                fun bind(lesson: lesson) {
                    binding.text.text = lesson.lesson

                    Glide.with(binding.image).load(lesson.image).into(binding.image)
                    lesson.textColor.let {
                        if (it != null) {
                            binding.mainlayout.setBackgroundColor(itemView.context.getColor(it))

                        }
                        lesson.color.let {
                            if (it != null) {
                                binding.mainlayout.setBackgroundColor(itemView.context.getColor(it))

                            }
                        }
                    }
                }
            }
        }






