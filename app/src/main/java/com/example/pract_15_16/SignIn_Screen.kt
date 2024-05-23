package com.example.pract_15_16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class SignIn_Screen : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)
        email = findViewById(R.id.emailEditText)
        password = findViewById(R.id.passwordEditText)
    }

    fun welcom(view: View)
    {
        if(email.text.toString().toString().isNotEmpty() and password.text.toString().isNotEmpty() && (email.text.toString() == "ects") && (password.text.toString() == "ects2024"))
        {
            val intent = Intent(this, activity_main::class.java)
            startActivity(intent)
        }
        else {

            val alert = AlertDialog.Builder(this)
            alert.setTitle("Ошибка!!")
            alert.setMessage("Заполните все поля!")
            alert.setPositiveButton("ОК", null)
            alert.create()
            alert.show()
        }
    }

}