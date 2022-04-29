package com.example.k1hw6

import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.k1hw6.databinding.FragmentSecondBinding

class lessonAdapter( val data :ArrayList<lesson>) : RecyclerView.Adapter<lessonAdapter.LessonViewHolder>() {
    class LessonViewHolder (binding:FragmentSecondBinding) : RecyclerView.ViewHolder(binding.root) {
private val data= arrayListOf<lesson>()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}

