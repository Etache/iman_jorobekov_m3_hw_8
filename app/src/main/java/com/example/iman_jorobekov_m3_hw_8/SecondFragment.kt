package com.example.iman_jorobekov_m3_hw_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.iman_jorobekov_m3_hw_8.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = arguments
        val textFromFirstFragment = bundle?.getString("firstFragmentKey")

        println(textFromFirstFragment)

        binding.secondButton.setOnClickListener {
            val bundle = Bundle().apply {
                putString("secondFragmentKey", binding.editText.text.toString())
                putString("firstFragmentKey", binding.editText.text.toString())
            }
            bundle.putAll(arguments)
            view.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment, bundle)
        }
    }
}