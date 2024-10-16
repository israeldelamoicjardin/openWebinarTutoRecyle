package es.israeldelamo.openwebinar1
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Voy a devolver un viewholder al propio view que me llamo
 *
 * */


class TareasViewHolder(view:View):RecyclerView.ViewHolder(view) {

    /**
     * Creo la referencia y la inicializo directamente contra el xml
     */
    private val tvTarea:TextView = view.findViewById(R.id.tvTarea)


    /**
     * EL adapater al conectarse tiene el listado completo de tareas,
     * de ahí coge el string
     */
    fun render(tarea:String){
        tvTarea.text = tarea
    }

}