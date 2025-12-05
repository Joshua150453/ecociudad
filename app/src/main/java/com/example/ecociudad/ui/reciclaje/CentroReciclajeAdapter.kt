package com.example.ecociudad.ui.reciclaje

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecociudad.databinding.ItemCentroReciclajeBinding
import com.example.ecociudad.model.CentroReciclaje

class CentroReciclajeAdapter(private val lista: List<CentroReciclaje>) :
    RecyclerView.Adapter<CentroReciclajeAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemCentroReciclajeBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCentroReciclajeBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount() = lista.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val centro = lista[position]
        holder.binding.txtNombre.text = centro.nombre
        holder.binding.txtTipo.text = centro.tipo
        holder.binding.txtDireccion.text = centro.direccion
    }
}
