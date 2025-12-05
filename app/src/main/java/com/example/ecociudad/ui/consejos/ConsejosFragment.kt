package com.example.ecociudad.ui.consejos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecociudad.data.ConsejosData
import com.example.ecociudad.databinding.FragmentConsejosBinding

class ConsejosFragment : Fragment() {

    private var _binding: FragmentConsejosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentConsejosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.recyclerConsejos.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerConsejos.adapter = ConsejoAdapter(ConsejosData.listaConsejos)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
