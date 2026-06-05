package com.example.nabeeyaps.Home.pertemuan_10

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nabeeyaps.databinding.FragmentTabBBinding

class TabBFragment : Fragment() {
    private var _binding: FragmentTabBBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTabBBinding.inflate(inflater, container, false)
        return binding.root
    }
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
//        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
//            title = "Tab B"
//        }
//    }
}