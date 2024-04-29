package com.example.proyectopoo

import android.widget.EditText

class Ordenador(
    marca:String,
    modelo:String,
    estado:Estado, private var tipoCPU:String, private var ram: String
):Dispositivo(marca,modelo,estado) {

    override fun String(): String {
        return "Marca: $marca, Modelo: $modelo, Estado: $estado, CPU: $tipoCPU, RAM: $ram"
    }


}