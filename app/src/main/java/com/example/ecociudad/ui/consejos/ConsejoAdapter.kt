package com.example.ecociudad.ui.consejos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecociudad.databinding.ItemConsejoBinding
import com.example.ecociudad.model.Consejo

class ConsejoAdapter(private val lista: List<Consejo>) :
    RecyclerView.Adapter<ConsejoAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemConsejoBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemConsejoBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount() = lista.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val consejo = lista[position]
        holder.binding.txtTitulo.text = consejo.titulo
        holder.binding.txtDescripcion.text = consejo.descripcion
        holder.binding.txtCategoria.text = consejo.categoria.name
    }
}
