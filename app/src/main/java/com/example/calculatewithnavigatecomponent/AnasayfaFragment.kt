package com.example.calculatewithnavigatecomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.calculatewithnavigatecomponent.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private var _binding:FragmentAnasayfaBinding? = null
    private val binding get() =_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =FragmentAnasayfaBinding.inflate(inflater,container,false)



        binding.buttonA.setOnClickListener {
            // it bu sayafanın fragmenti
            Navigation.findNavController(it).navigate(R.id.detayGecisA)
        }

        binding.buttonX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.detayGecisX)
        }
        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

private const val ARG_PARAM2 = "param2"
