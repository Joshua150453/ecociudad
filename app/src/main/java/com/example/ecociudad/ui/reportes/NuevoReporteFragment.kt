package com.example.ecociudad.ui.reportes

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.ecociudad.databinding.FragmentNuevoReporteBinding

class NuevoReporteFragment : Fragment() {

    private lateinit var binding: FragmentNuevoReporteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNuevoReporteBinding.inflate(inflater, container, false)

        // Botón para guardar el reporte
        binding.btnGuardar.setOnClickListener {
            val descripcion = binding.txtDescripcion.text.toString()
            val ubicacion = binding.txtUbicacion.text.toString()

            // Validación simple (avance funcional)
            if (descripcion.isEmpty()) {
                Toast.makeText(requireContext(), "Ingrese una descripción del reporte", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (ubicacion.isEmpty()) {
                Toast.makeText(requireContext(), "Ingrese la ubicación aproximada", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // aquí irá la lógica de guardar (Función en Proceso)
            Toast.makeText(requireContext(), "Reporte guardado correctamente", Toast.LENGTH_LONG).show()
        }

        // Botón para tomar foto (geolocalización pendiente)
        binding.btnFoto.setOnClickListener {
            // (Función en Proceso)
            Toast.makeText(requireContext(), "Función en proceso...", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}
