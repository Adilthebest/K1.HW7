package com.example.k1hw6

import android.content.Context
import android.view.LayoutInflater
import com.example.k1hw6.databinding.ItemLessonBinding
import java.io.Serializable
import kotlin.coroutines.coroutineContext

data class lesson(
    var lesson:String? = null,
    var  image:String?= null,
    var  color:Int? = null,
    var textColor: Int? = null
) : Serializable


