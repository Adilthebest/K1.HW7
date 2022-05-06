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


class LessonAdapter(private val data: ArrayList<lesson>, private val onClick: ((pos: Int) -> Unit)? = null) :
    RecyclerView.Adapter<LessonAdapter.LessonHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonHolder {
        return LessonHolder(ItemLessonBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: LessonHolder, position: Int) {
        holder.bind(data[position])
        holder.itemView.setOnClickListener {
            onClick?.let { it1 -> it1(position) }
        }
    }


    override fun getItemCount(): Int = data.size


    inner  class LessonHolder(private val binding: ItemLessonBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(lessons: lesson) {
            binding.text.text = lessons.lesson
            Glide.with(binding.image).load(lessons.textColor).into(binding.image)
            lessons.color?.let {
                if (it != null){
                    binding.mainlayout.setBackgroundColor(itemView.context.getColor(it))
                }
            }
            lessons.textColor?.let {
                if (it != null) {
                    binding.text.setBackgroundColor(itemView.context.getColor(it))
                }
            }
        }
    }
}




