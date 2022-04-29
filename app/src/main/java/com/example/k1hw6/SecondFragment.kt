package com.example.k1hw6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.k1hw6.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) {
        binding = FragmentSecondBinding.inflate(layoutInflater)

    }
    }
}