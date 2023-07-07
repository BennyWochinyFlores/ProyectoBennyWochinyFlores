package bwf.idat.evaluacioncontinua01bennywochinyflores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import bwf.idat.evaluacioncontinua01bennywochinyflores.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btninicio.setOnClickListener {
            Toast.makeText(applicationContext, "Muchas Gracias por Ingresar"
                , Toast.LENGTH_LONG).show()
            val intent= Intent(this,MenuLogin::class.java)
            startActivity(intent)
        }
    }
}