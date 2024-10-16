package es.israeldelamo.openwebinar1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : ComponentActivity() {



    // creo la instancia pero no la inicializo
    lateinit var botonAceptar: Button
    //creo una instalcia para editext
    lateinit var  textoEmail: EditText
    //creo una instancia del recycleview
    lateinit var rvTareas: RecyclerView

    //creacción de los datos para el ReclycleView
    var tareas = mutableListOf<String>()

    //instancia del apatador
    lateinit var adaptador: TareaAdaptador


    override fun onCreate(savedInstanceState: Bundle?) {


        // crear una instancia
        super.onCreate(savedInstanceState)
        //asociarl el xml
        setContentView(R.layout.activity_main)
        initUI()
    }


    /**
     * Inicializa el UI
     */

    private fun initUI(){
        initView()
        initListeners()
        initRecyclerView()
    }


    /**
     * Asocia el recyclerview con su ViewHolder y el adapter
     */
    private fun initRecyclerView() {
        //asociamos a como se va  a ver las elementos
        rvTareas.layoutManager = LinearLayoutManager(this)
        //instancia del apater con las tareas
        adaptador = TareaAdaptador(tareas)
        //enlazamos
        rvTareas.adapter = adaptador
    }


    /**
     * Asocia los compoenntes por ID
     */
    private fun initView(){
        //desde R.id. podemos buscar su referencia
        botonAceptar = findViewById(R.id.botonAceptar)
        //esde R.id. busco su referencia
        textoEmail = findViewById(R.id.textoEmail)
        //sdesde R.id. asocio la referencia
        rvTareas = findViewById(R.id.rvTareas)
    }

    /**
     * Añade todos los listeners a los diferentes compoenntes
     */
    private fun initListeners(){
        botonAceptar.setOnClickListener() {  anyadirTarea() }
    }


    /**
     * Añade tareas nuevas al tableview
     */
    private fun anyadirTarea() {
        val tareaAAnyadir = textoEmail.text.toString()
        tareas.add(tareaAAnyadir)
        //con esto esta atento a camios para poderlo actualizar, es como observable
        adaptador.notifyDataSetChanged()
        //limpio el texto
        textoEmail.setText("")
    }


    /**
     *  Esta funcion prueba es soolo un ejemplo
     *  @param parametroEntrada por defectp es "cadena por defecto"
     *  @return devuelve la frase "una frase de vuelta"
     */
/*
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

    }*/





}

