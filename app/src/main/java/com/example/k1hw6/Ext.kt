package com.example.k1hw6

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun Fragment.case(msg:String) {

}
fun AppCompatActivity.lauchFragment(fragment: Fragment){
    this.supportFragmentManager.beginTransaction().add(R.id.container,fragment).commit()

}
fun FragmentActivity.replaceFragment(fragment: Fragment) {
    this.supportFragmentManager.beginTransaction().replace(R.id.container,fragment).addToBackStack("").commit()

}
