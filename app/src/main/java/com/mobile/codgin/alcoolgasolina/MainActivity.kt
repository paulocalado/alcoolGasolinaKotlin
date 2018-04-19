package com.mobile.codgin.alcoolgasolina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener { calcularPreco() }
    }

    fun calcularPreco(){


        if(editAlcool.text.toString().isEmpty()||editGasolina.text.toString().isEmpty()){
            txtResultado.text = "Preencha todos os campos"
        }else {
            val precoGasolina =  editGasolina.text.toString().toDouble()
            val precoAlcool = editAlcool.text.toString().toDouble()

                if ((precoAlcool / precoGasolina) >= 0.7) {
                    txtResultado.text = "MELHOR USAR GASOLINA"
                } else {
                    txtResultado.text = "MELHOR USAR ALCOOL"
                }
        }
    }
}
