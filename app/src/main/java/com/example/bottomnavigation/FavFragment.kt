package com.example.bottomnavigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigation.databinding.FragmentFavBinding


class FavFragment : Fragment() {

    private lateinit var communicator: Communicator
    private lateinit var binding: FragmentFavBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavBinding.inflate(inflater, container, false)
        communicator = activity as Communicator
        binding.Submitbtn.setOnClickListener {


Log.i("SomeDebug" , "Edit Text Value:- ${binding.data1.text}")
            communicator.passData(binding.data1.text.toString())

        }

        return binding.root
    }

}
