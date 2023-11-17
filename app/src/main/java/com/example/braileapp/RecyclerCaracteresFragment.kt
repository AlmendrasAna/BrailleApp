package com.example.braileapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.braileapp.databinding.FragmentRecyclerCaracteresBinding

class RecyclerCaracteresFragment : Fragment() {

    lateinit var binding: FragmentRecyclerCaracteresBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecyclerCaracteresBinding.inflate(layoutInflater)
        initView()
        return binding.root
    }

    private fun initView() {
val adapter = Adapter()
        adapter.setData(loadCaracteresList())
        binding.recyclerView.adapter = adapter
}
}