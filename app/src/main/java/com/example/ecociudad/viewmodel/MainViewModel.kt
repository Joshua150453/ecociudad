package com.example.ecociudad.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ecociudad.model.*

class MainViewModel : ViewModel() {

    // Listas temporales (antes de usar Room o Firebase)
    private val _reportes = MutableLiveData<List<Reporte>>(emptyList())
    val reportes: LiveData<List<Reporte>> = _reportes

    private val _centros = MutableLiveData<List<CentroReciclaje>>(emptyList())
    val centros: LiveData<List<CentroReciclaje>> = _centros

    private val _consejos = MutableLiveData<List<Consejo>>(emptyList())
    val consejos: LiveData<List<Consejo>> = _consejos

    // Insertar reporte (Función en Proceso - solo local por ahora)
    fun agregarReporte(reporte: Reporte) {
        val lista = _reportes.value!!.toMutableList()
        lista.add(reporte)
        _reportes.value = lista
    }
}
