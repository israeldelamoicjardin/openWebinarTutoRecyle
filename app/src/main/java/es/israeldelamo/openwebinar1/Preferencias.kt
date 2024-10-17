package es.israeldelamo.openwebinar1

import android.content.Context
import android.content.SharedPreferences


/**
 * Trabajara con Shared Preferences
 */

class Preferencias(context: Context) {
    /**
     * Las constatantes de declaran aqui
     */
    companion object{
        const val PREFS_NAME = "misBaseDeDatos"
    }



    /**
     * Creo una base de datos con ese nombre
     */
    val prefs:SharedPreferences = context.getSharedPreferences(PREFS_NAME,0)


    /**
     * Esta funcion trabaja solo con mi constante prefs creada arriba
     */
    fun salvarInformacion(){
        // en prefs edita, pon un string, en el atributo "CAMPO1", pon la frasecilla y después aplica
        prefs.edit().putString("CAMPO1","el dato de campo 1").apply()

    }

}