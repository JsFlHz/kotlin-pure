package com.example.kotlinpure.wz.kotlin.basics
/*
Crea una clase que pueda representar la estructura de una canción. La clase Song debe incluir estos elementos de código:

Propiedades para el título, el artista, el año de publicación y el recuento de reproducciones
Propiedad que indica si la canción es popular (si el recuento de reproducciones es inferior a 1,000, considera que es poco popular)
Un método para imprimir la descripción de una canción en este formato:
"[Título], interpretada por [artista], se lanzó en [año de lanzamiento]".

 */
data class Song(
    val title: String,
    val artist: String,
    val year: Int,
    val reproductions: Int,
    val isPopular: Int
) {
    fun printSong() {
        println("$title, interpretada por $artist, se lanzó en $year.")
        title.let {  }
    }
}


