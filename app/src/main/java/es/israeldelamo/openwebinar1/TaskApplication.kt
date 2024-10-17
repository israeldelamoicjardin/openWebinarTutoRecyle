package es.israeldelamo.openwebinar1

import android.app.Application


/**
 * Punto de entrada de la aplicación
 */

class TaskApplication:Application() {
    /**
     * Para que sea accesible desde toda la aplicacíon, lo pongo aquí, uso en lateInit porque no
     * tengo baseContext para inizalizarlo
     */
    companion object{
        lateinit var prefs:Preferencias
    }

    override fun onCreate() {
        super.onCreate()
        prefs =  Preferencias(baseContext)

    }
}