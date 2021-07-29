package funcoes


fun main(args: Array<String>) {
    //println("Olá ${args[1]}")

    val isUnit = println("This is an expression")
    println(isUnit)

    var retorno = verificar("11")
    println(retorno)
}


fun verificar(str: String): String = if (str.toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin"