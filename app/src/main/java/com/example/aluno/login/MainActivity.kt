package com.example.aluno.login

import android.os.Bundle
import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.view.View
import android.widget.TextView
import org.jetbrains.anko.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btLogin: Button = findViewById(R.id.btLogin)

        btLogin.setOnClickListener(View.OnClickListener {
            val textViewLogin: TextView = findViewById<TextView>(R.id.etUserName) as TextView
            val textViewSenha: TextView = findViewById<TextView>(R.id.epSenha) as TextView

            val loginResult: Boolean = AppStaticServices.login(
                    textViewLogin.text.toString(),
                    textViewSenha.text.toString())

            if (loginResult == true) {
                toast("Login realizado com Sucesso")
            } else {
                toast("Usuario ou Senha incorretos")
            }
        })
    }
}