package com.example.ecociudad.model

// Data class básica (Room se agregará luego)
// Comentado: representará los reportes ambientales
data class Reporte(
    val id: Int = 0,
    val descripcion: String,
    val ubicacion: String,
    val fecha: String,
    val fotoUrl: String = "(Función en Proceso)"  // luego se subirá a Firebase
)
