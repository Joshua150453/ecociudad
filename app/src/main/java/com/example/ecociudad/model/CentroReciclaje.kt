package com.example.ecociudad.model

data class CentroReciclaje(
    val nombre: String,
    val tipo: String,
    val direccion: String,
    val esFavorito: Boolean = false
)
