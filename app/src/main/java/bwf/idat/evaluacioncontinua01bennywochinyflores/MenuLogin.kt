package bwf.idat.evaluacioncontinua01bennywochinyflores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import bwf.idat.evaluacioncontinua01bennywochinyflores.databinding.ActivityMainBinding
import bwf.idat.evaluacioncontinua01bennywochinyflores.databinding.ActivityMenuLoginBinding

class MenuLogin : AppCompatActivity() {
    private lateinit var binding: ActivityMenuLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMenuLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnlogin.setOnClickListener {
            val email = binding.txtusuario.text.toString()
            val password = binding.txtpassword.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Ingrese un email y contraseña válidos", Toast.LENGTH_SHORT).show()
            } else {
                (email == "benny.wochiny@idat.edu.pe" && password == "123456")
                Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
                val intent= Intent(this,MenuPrincipal::class.java)
                startActivity(intent)
            }
        }
    }
}