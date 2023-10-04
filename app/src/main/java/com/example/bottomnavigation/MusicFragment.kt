package com.example.bottomnavigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigation.databinding.FragmentMusicBinding


class MusicFragment : Fragment() {


    private lateinit var binding: FragmentMusicBinding
    private var output: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this
        binding = FragmentMusicBinding.inflate(inflater, container, false)
        output = arguments?.getString("data")
        binding.data2.text = output
        Log.i("SomeDebug" , output.toString())
        return binding.root




    }



}







