package com.example.proyectopoo

class Smartphone(marca:String,modelo:String,estado:Estado,private var esDualSim: String):Dispositivo(marca,modelo,estado) {

   override fun String():String{
        return "Marca: $marca, Modelo: $modelo, Estado: $estado, Dual Sim: $esDualSim"
    }
}