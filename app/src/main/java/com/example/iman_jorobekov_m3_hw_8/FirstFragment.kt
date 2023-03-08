package com.example.iman_jorobekov_m3_hw_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.iman_jorobekov_m3_hw_8.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var binding:FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.firstButton.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("firstFragmentKey", binding.editText.text.toString())
            view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
        }
    }
}