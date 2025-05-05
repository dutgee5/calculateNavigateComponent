package com.example.calculatewithnavigatecomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.calculatewithnavigatecomponent.databinding.FragmentYBinding
import com.google.android.material.snackbar.Snackbar

class YFragment : Fragment() {

    private var _binding:FragmentYBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentYBinding.inflate(inflater,container,false)




        val backPress = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Snackbar.make(binding.headerTitleY, "Do you want to go to Home Page?", Snackbar.LENGTH_SHORT)
                    .setAction("Yes") {
                        findNavController().popBackStack(R.id.home,false)
                    }.show()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, backPress)


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}