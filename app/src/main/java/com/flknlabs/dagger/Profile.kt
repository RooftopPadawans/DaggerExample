package com.flknlabs.dagger

import javax.inject.Inject

class Profile @Inject constructor() {
    val nombre = "David Perez"
    val profesion = "Instructor Android"
    val compania = "Rooftop Dev"
    val correo = "dpereze1105@gmail.com"

    fun greetings(): String {
        return "Hola me llamo $nombre y soy $profesion en $compania mi contacto es $correo"
    }
}