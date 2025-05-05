package com.example.calculatewithnavigatecomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.calculatewithnavigatecomponent.databinding.FragmentBBinding

class BFragment : Fragment() {

    private var _binding:FragmentBBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBBinding.inflate(inflater,container,false)

        binding.buttonY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.detayGecisY1)
        }
        return binding.root
    }

}