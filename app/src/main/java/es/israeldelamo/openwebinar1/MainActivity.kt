package es.israeldelamo.openwebinar1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import es.israeldelamo.openwebinar1.ui.theme.OpenWebinar1Theme
import java.util.logging.Logger

class MainActivity : ComponentActivity() {

    val listaDeTareas:MutableList<String>

    override fun onCreate(savedInstanceState: Bundle?) {

        listaDeTareas.add("Hola")


        // crear una instancia
        super.onCreate(savedInstanceState)
        //asociarl el xml
        setContentView(R.layout.activity_main)



    }

    /**
     *  Esta funcion prueba es soolo un ejemplo
     *  @param parametroEntrada por defectp es "cadena por defecto"
     *  @return devuelve la frase "una frase de vuelta"
     */

    fun prueba(parametroEntrada:String = "CADENA por defecto"): String{
        val nuevaPalabra:String = "Esta palabra vine de la funcion"
        // una cadena que puede ser nula
        val unaCadenaALomejorNula:String? = null
        //que sea seguro que no es nulo
        if (unaCadenaALomejorNula!!.length > 0) {
            kotlin.io.print("hola")
        }
        // que si es nulo no de fallo y devuelva 3
        if ((unaCadenaALomejorNula?.length ?: 3) > 0) {
            kotlin.io.print("hola")
        }


        if(parametroEntrada=="cadena por defecto") {
            return "CADENA por defecto"
        }
        else {
            return parametroEntrada
        }

    }





}

