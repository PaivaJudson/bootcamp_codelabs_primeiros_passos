package funcoes

fun main() {

    //println("Your fortune is: ${getFortuneCookie()}")
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    /*
    println( decorations.filter {it[1] == 'l'})
    val lista1 = decorations.filter {it[1] == 'l'}

    println("Oficial = $lista1")
    val lista2 = decorations.filter { it [0] == 'p' }
    println("lista2 = ${lista2}")

    val lista3 = decorations.asSequence().filter { it [0] == 'p' }.toList()
    println("lista3 = ${lista3}")
    */
}

fun getFortuneCookie(): String{
    val lista = listOf("You will have a great day!", "Things will go well for you today.",
                       "Enjoy a wonderful day of success.", "Be humble and all will turn out well.",
                       "Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
                       "Treasure your friends because they are your greatest fortune.")

    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return lista[birthday.rem(lista.size)]
}




fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun swim(speed: String = "fast") = println("swimming ${speed}")

fun f1(x: Int, y: Int = 2, z: Int = funcao()): Boolean{
    return true
}

fun funcao(): Int = 2