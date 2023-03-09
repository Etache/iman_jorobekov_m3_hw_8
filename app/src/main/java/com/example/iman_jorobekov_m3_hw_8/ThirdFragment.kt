package com.example.iman_jorobekov_m3_hw_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.iman_jorobekov_m3_hw_8.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textFromFirstFragment = arguments?.getString("firstFragmentKey")
        val textFromSecondFragment = arguments?.getString("secondFragmentKey")

        println(textFromFirstFragment)
        println(textFromSecondFragment)

        binding.textViewCitata.text = textFromSecondFragment
        binding.textViewName.text = textFromFirstFragment
    }
}