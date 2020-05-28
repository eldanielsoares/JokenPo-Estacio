package com.flyppcorp.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*
import java.util.*

class ResultActivity : AppCompatActivity() {
    //variavel que vai capturar escolha do computador
    private var pass: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        //Variavel que pega a escolha do jogador vindo da outra activity
        val extras = intent.extras
        //escolha randomica da maquina
        pass = Random().nextInt(3)

        if (extras != null) {
            val passado = extras.getInt("escolha")
            handleUser(passado)
            handleResult(passado, pass)
        }
        handleS(pass)


    }

    //Funcao que compara valores e mostra o vencedor
    private fun handleResult(passado: Int, pass: Int?) {
        when {
            //combinações para empate
            passado == 0 && pass == 0 -> {
                txtResult.text = "Empate"
            }
            passado == 1 && pass == 1 -> {
                txtResult.text = "Empate"
            }
            passado == 2 && pass == 2 -> {
                txtResult.text = "Empate"
            }
            //fim

            //comparações para pedra
            passado == 0 && pass == 1 -> {
                txtResult.text = "Computador"
            }
            passado == 0 && pass == 2 -> {
                txtResult.text = "Você"
            }

            //comparações para papel
            passado == 1 && pass == 0 -> {
                txtResult.text = "Você"
            }
            passado == 1 && pass == 2 -> {
                txtResult.text = "Computador"
            }

            //comparações para tesoura
            passado == 2 && pass == 0 -> {
                txtResult.text = "Computador"
            }
            passado == 2 && pass == 1 -> {
                txtResult.text = "Você"
            }
        }
    }

    //funcao que mostra o que a maquina escolheu
    private fun handleS(pass: Int?) {
        when (pass) {
            0 -> txtComputador.text = "Pedra"
            1 -> txtComputador.text = "Papel"
            2 -> txtComputador.text = "Tesoura"
        }
    }

    //funcao que mostra o que o jogador escolheu.
    private fun handleUser(passado: Int) {
        when (passado) {
            0 -> txtEscolhaUser.text = "Pedra"
            1 -> txtEscolhaUser.text = "Papel"
            2 -> txtEscolhaUser.text = "Tesoura"
        }
    }
}
