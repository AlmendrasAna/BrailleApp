package com.example.braileapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.braileapp.databinding.ItemLetraBinding

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {


    private var caracterList: List<Caracter> = emptyList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding = ItemLetraBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {

        return caracterList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemClass = caracterList[position]
        holder.bind(itemClass)
    }

    fun setData(listCaracter: List<Caracter>) {
        this.caracterList = listCaracter
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ItemLetraBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(caracter: Caracter) {
            caracter.codigo.dibujarCaracter(binding)
            binding.caracter.text = caracter.caracter
        }

    }
}