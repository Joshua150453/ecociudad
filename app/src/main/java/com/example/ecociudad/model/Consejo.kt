package com.example.ecociudad.model

enum class Categoria { AGUA, ENERGIA, TRANSPORTE, RECICLAJE }

data class Consejo(
    val titulo: String,
    val descripcion: String,
    val categoria: Categoria,
    val favorito: Boolean = false
)
