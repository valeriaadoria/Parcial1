package edu.iest.parcial1

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    var sph : Spinner? = null
    private var textoSeleccionado: String?=null

    private var cambioIcon : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val capital= findViewById<TextView>(R.id.pie)
        capital.setOnClickListener{
            finish()
        }

        val ivLogo= findViewById<ImageView>(R.id.antman)

        ivLogo.setOnClickListener{
            var arregloImagenes = arrayOf<Int>(R.drawable.antman, R.drawable.antman2)
            if (cambioIcon){
                ivLogo.setImageResource(arregloImagenes[0])
            }else{
                ivLogo.setImageResource(arregloImagenes[1])
            }
            cambioIcon= !cambioIcon
        }


        val spHorario = findViewById<Spinner>(R.id.spHorario)
            spHorario.setOnItemSelectedListener(this)


        var bnComprar = findViewById<Button>(R.id.comprar)
        bnComprar.setOnClickListener{
          //  val hora = etCalif.text.toString().toFloat()

        }



    }
}

private fun Spinner.setOnItemSelectedListener(mainActivity: MainActivity) {

}
