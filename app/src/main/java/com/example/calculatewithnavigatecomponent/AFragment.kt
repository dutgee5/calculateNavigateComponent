package com.example.calculatewithnavigatecomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.calculatewithnavigatecomponent.databinding.FragmentABinding


class AFragment : Fragment() {

    private var _binding:FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentABinding.inflate(inflater,container,false)


        binding.buttonB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.detayGecisB)
        }
        return binding.root
    }
}

private const val ARG_PARAM2 = "param2"
