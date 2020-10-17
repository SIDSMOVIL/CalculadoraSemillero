package com.example.calculadorasemillero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnSuma)
            // Boton Suma
            btn.setOnClickListener{
                //Variables iniciales del texto en las casillas
                var evN1 = findViewById<EditText>(R.id.numero1).text
                var evN2 = findViewById<EditText>(R.id.numero2).text
                // Manejo del error si algun campo esta vacio
                if (evN1.isEmpty()||evN2.isEmpty()){
                    // Mensaje en pantalla
                    Toast.makeText(this,"Llena todos los campos",Toast.LENGTH_SHORT).show()
                }
                else{
                    //Creacion de variables evitando el error de las casillas vacias
                    var n1 = findViewById<EditText>(R.id.numero1).text.toString().toInt()
                    var n2 = findViewById<EditText>(R.id.numero2).text.toString().toInt()
                    sumar(n1,n2)
                }

            }

        //Implementar botones Resta - Multiplicacion - Division

    }

    private fun sumar(numero1: Int, numero2:Int){
        var res:Int = numero1+numero2
        mostrar(res)
    }

    private fun mostrar(res:Int){
        val resultado = findViewById<TextView>(R.id.resultado)
        resultado.text = res.toString()
    }

}