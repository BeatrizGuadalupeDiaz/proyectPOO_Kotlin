package com.example.proyectopoo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectopoo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val dispositivo = Dispositivo("1","2",Estado.NUEVO)
        var ordenador = Ordenador("","", Estado.NUEVO,"","")
        var tableta = Tableta("","",Estado.NUEVO,"0")
        var smartphone = Smartphone("","",Estado.NUEVO,"false")

        binding.btnAddOrdenador.setOnClickListener {
            var marca = binding.etMarcaOrdenador.editableText.toString()
            var modelo = binding.etModeloOrdenador.editableText.toString()
            var cpu = binding.etCpu.editableText.toString()
            var ram = binding.etRam.editableText.toString()
            ordenador = Ordenador(marca,modelo,Estado.EN_REPARACION,cpu,ram)
            RegistroDispositivos.agregar(ordenador)
        }
        binding.btnAddTableta.setOnClickListener {
            var marca = binding.etMarcaTableta.editableText.toString()
            var modelo = binding.etModeloTableta.editableText.toString()
            val pantalla = binding.etPantalla.editableText.toString()
            tableta = Tableta(marca,modelo,Estado.USADO,pantalla)
            RegistroDispositivos.agregar(tableta)
        }
        binding.btnAddSmartphone.setOnClickListener {
            var marca = binding.etMarcaSmartphone.editableText.toString()
            var modelo = binding.etModeloSmartphone.editableText.toString()
            var dual_sim = binding.etSim.editableText.toString()
            smartphone = Smartphone(marca,modelo,Estado.NUEVO,dual_sim)
            RegistroDispositivos.agregar(smartphone)
        }

        binding.btnMostrar.setOnClickListener {
            var texto = "Ordenador: ${ordenador.String()} , Tableta: ${tableta.String()} , Smartphone: ${smartphone.String()}"
            binding.meustra.text = texto
        }

        binding.btnBuscar.setOnClickListener {
            var modelo = binding.etBuscarModelo.editableText.toString()
            var marca = binding.etBuscarMarca.editableText.toString()
            val buscar = RegistroDispositivos.buscar(marca,modelo)
                binding.tvBuscarEstado.text = buscar.toString()
        }
        binding.btnCambiarEstado.setOnClickListener {
            RegistroDispositivos.listaDispositivos[0].estado = Estado.NUEVO
        }

    }
}