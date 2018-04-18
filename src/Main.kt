fun sumarDosNumeros(numeroUno: Int, numeroDos: Int): Int {
    return numeroUno + numeroDos
}

fun main(args: Array<String>) {
    println("Hola, mundo!") // System.out.
    println(sumarDosNumeros(1, 2)) // 3
    var nombre: String? = "Adrian"
    var edad = 28
    val edadActual = 28
    var casado = false
    casado = true
    // duck typing
    // edadActual = 29
    nombre = null

    when (casado) {
        true -> {
            println("Esta casado")
        }
        null -> {
            println("Aun no esta asignado")
        }
        else -> {
            println("No esta casado")
        }
    }

    val superHeroe = if (casado) {
        "SuperMandarina"
    } else {
        "Superman"
    }
    // template strings
    println("Superheroe: ${superHeroe}")

    var adrian = Persona(Integer(28), "Adrian")
    println(adrian.toString())


}

class Persona {
    lateinit var edadActual: Integer
    var nNombre: String

    // constructor(edad:Any){
    // ctrl + a
    // ctrl + alt + l

    constructor(edad: Integer, nombre: String) {
        iniciar(edad)
        nNombre = nombre
    }

    fun iniciar(edad: Integer) {
        edadActual = edad
    }

    override fun toString(): String {
        return "La edad ectual es $edadActual y el nombre es $nNombre"
    }


}

class PersonaDos(edad: Integer, nombre: String) {
    var nEdad = edad
    var nNombre = nombre
    var nCedula: String? = null
    var nCasado: Boolean? = null

    constructor(edad2: Integer, nombre2: String, cedula: String) : this(edad2, nombre2) {
        nCedula = cedula

    }

    constructor(edad3: Integer, nombre3: String, cedula2: String, casado1: Boolean) : this(edad3, nombre3) {
        nCedula = cedula2
        nCasado = casado1

    }
}

class PersonaTres(edad: Integer, nombre: String) {
    lateinit var nEdad: Integer
    var nNombre = nombre

    init {
        // escribir codigo despues del constructor
        iniciar(edad)
    }

    fun iniciar(edad: Integer) {
        nEdad = edad
    }


}

open class Figura(nombre: String) {
    val nNombre = nombre
}

class Cuadrado(nombre: String, valorLado: Integer)
    : Figura(nombre) {
    var nValorLado = valorLado
}




