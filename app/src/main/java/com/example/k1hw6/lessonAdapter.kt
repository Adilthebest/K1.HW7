package com.example.k1hw6

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.k1hw6.databinding.FragmentSecondBinding
import com.example.k1hw6.databinding.ItemLessonBinding

        class lessonAdapter( val data :ArrayList<lesson>) : RecyclerView.Adapter<lessonAdapter.LessonViewHolder>() {
       inner     class LessonViewHolder(private val binding: ItemLessonBinding) :
                RecyclerView.ViewHolder(binding.root) {

           fun bind(lesson: lesson) {
                    if (lesson.color != null) {
                        binding.mainlayout.setBackgroundColor(itemView.context.getColor(lesson.color!!))
                    }
                    binding.text.text = lesson.lesson

                  Glide.with(binding.image).load(lesson.image).into(binding.image)
                }
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        return LessonViewHolder(
        ItemLessonBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        return holder.bind(data.get(position))
    }

    override fun getItemCount(): Int = data.size




    }





