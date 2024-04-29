package com.example.proyectopoo

import android.icu.text.LocaleDisplayNames.DialectHandling

object RegistroDispositivos {
    val listaDispositivos = mutableListOf<Dispositivo>()

    fun agregar(dispositivo: Dispositivo) {
        if(!listaDispositivos.equals(dispositivo)){
            listaDispositivos.add(dispositivo)
        }
    }
    fun remover(dispositivo: Dispositivo) {
        if(listaDispositivos.contains(dispositivo)){
            listaDispositivos.remove(dispositivo)
        }
    }
    fun buscar(marca: String, modelo: String): String?{
        var producto = listaDispositivos.find { it.marca == marca && it.modelo == modelo }
        return "Estado: ${producto?.estado}"
    }

    fun mostrarLista():String {
       val productos = listaDispositivos.forEach{
           return "Modelo: ${it.modelo} Marca: ${it.marca} Estado: ${it.estado}"
       }
        return productos.toString()
    }

}