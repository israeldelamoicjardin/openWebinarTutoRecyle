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



}