package com.example.calculatewithnavigatecomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.calculatewithnavigatecomponent.databinding.FragmentXBinding
import com.google.android.material.snackbar.Snackbar

class XFragment : Fragment() {

    private var _binding:FragmentXBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentXBinding.inflate(inflater,container,false)


        binding.buttonY2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.detayGecisY2)
        }

        return binding.root
    }
}