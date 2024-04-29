package com.example.proyectopoo

open class Dispositivo (val marca:String, val modelo:String, var estado:Estado):Producto {
    override fun String(): String {
        return "Marca: $marca, Modelo: $modelo, Estado: $estado"
    }

}