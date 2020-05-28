package com.flyppcorp.jokenpo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Botões para escolher entre pedra, papel ou tesoura
        btnPedra.setOnClickListener {

            handleEscolha(0)
        }

        btnPapel.setOnClickListener {

            handleEscolha(1)
        }

        btnTesoura.setOnClickListener {

            handleEscolha(2)
        }




    }

    //Função que passa para a outra activity a escolha
    private fun handleEscolha(escolha: Int) {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("escolha", escolha)
        startActivity(intent)

    }


}
