package com.example.braileapp

import com.example.braileapp.databinding.ItemLetraBinding

fun String.orderBy(): String {
this.toCharArray().apply { sort()}
    return this
}

fun String.dibujarCaracter(binding: ItemLetraBinding){
    clearItem(binding)
    this.toCharArray().forEach { caracter->
        when (caracter) {
            '1' -> binding.uno.setImageResource(R.drawable.baseline_circle_24_black)
            '2' -> binding.dos.setImageResource(R.drawable.baseline_circle_24_black)
            '3' -> binding.tres.setImageResource(R.drawable.baseline_circle_24_black)
            '4' -> binding.cuatro.setImageResource(R.drawable.baseline_circle_24_black)
            '5' -> binding.cinco.setImageResource(R.drawable.baseline_circle_24_black)
            '6' -> binding.seis.setImageResource(R.drawable.baseline_circle_24_black)
        }
    }

}


fun clearItem(binding: ItemLetraBinding){
    binding.uno.setImageResource(R.drawable.baseline_circle_24)
    binding.dos.setImageResource(R.drawable.baseline_circle_24)
    binding.tres.setImageResource(R.drawable.baseline_circle_24)
    binding.cuatro.setImageResource(R.drawable.baseline_circle_24)
    binding.cinco.setImageResource(R.drawable.baseline_circle_24)
    binding.seis.setImageResource(R.drawable.baseline_circle_24)
}