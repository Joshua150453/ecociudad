package com.example.ecociudad.ui.consejos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.Toast
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ecociudad.R

class ConsejosFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(requireContext(), "Mostrando consejos ecológicos...", Toast.LENGTH_SHORT).show()
    }

}
