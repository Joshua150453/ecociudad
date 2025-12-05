package com.example.ecociudad.ui.reciclaje

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecociudad.data.CentrosReciclajeData
import com.example.ecociudad.databinding.FragmentCentrosReciclajeBinding

class CentrosReciclajeFragment : Fragment() {

    private var _binding: FragmentCentrosReciclajeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCentrosReciclajeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.recyclerCentros.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerCentros.adapter = CentroReciclajeAdapter(CentrosReciclajeData.listaCentros)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
