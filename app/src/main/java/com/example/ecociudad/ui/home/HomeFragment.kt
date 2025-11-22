package com.example.ecociudad.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ecociudad.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        // Navegación a Reportes
        binding.btnReportes.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeToReportes())
        }

        // Navegación a Centros de Reciclaje
        binding.btnReciclaje.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeToReciclaje())
        }

        // Navegación a Consejos Ecológicos
        binding.btnConsejos.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeToConsejos())
        }

        return binding.root
    }
}
