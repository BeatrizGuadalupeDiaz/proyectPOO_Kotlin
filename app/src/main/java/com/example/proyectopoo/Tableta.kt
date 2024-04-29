package com.example.proyectopoo

class Tableta(marca:String, modelo:String, estado:Estado, private var tamañoPantalla: String):Dispositivo(marca,modelo,estado) {
    override fun String():String{
        return "Marca: $marca, Modelo: $modelo, Estado: $estado, Pantalla: $tamañoPantalla"
    }
}