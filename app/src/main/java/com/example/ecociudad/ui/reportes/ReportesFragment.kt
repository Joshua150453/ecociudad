package com.example.ecociudad.ui.reportes

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ecociudad.databinding.FragmentReportesBinding

class ReportesFragment : Fragment() {

    private lateinit var binding: FragmentReportesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentReportesBinding.inflate(inflater, container, false)

        // Botón para crear un nuevo reporte
        binding.btnNuevoReporte.setOnClickListener {
            findNavController().navigate(ReportesFragmentDirections.actionReportesToNuevo())
        }

        // Aquí irá el RecyclerView (Función en Proceso)

        return binding.root
    }
}
