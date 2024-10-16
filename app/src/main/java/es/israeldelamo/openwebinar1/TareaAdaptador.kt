package es.israeldelamo.openwebinar1;

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Creo una clase que aprovecha un codigo externo, el del adapter del recycleview
 * a ese recycle view le paso el modelo de ViewHolder
 */

 public class TareaAdaptador(private val tareas: List<String>):RecyclerView.Adapter<TareasViewHolder>() {


 /**
  * Relaciona el vision con el ViewHolder usando el contexto del parent, solo al crearlo
  */
 override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TareasViewHolder {
  //usando el XML del resources, lo asigno
   val layouInflater:LayoutInflater = LayoutInflater.from(parent.context)
  return TareasViewHolder(layouInflater.inflate(R.layout.item_tarea, parent, false))
 }

 /**
  * Cuantos elementos a mostrar
  */
 override fun getItemCount() = tareas.size

 /**
  * Dibuja cada elemento segun necesita según la posición y los datos del listado de tareas
  */
 override fun onBindViewHolder(holder: TareasViewHolder, position: Int) {
   holder.render(tareas[position])
 }
}
