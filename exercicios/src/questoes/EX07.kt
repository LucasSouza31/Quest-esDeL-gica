package questoes

fun main() {

    println("Informe valores booleanos a seguir")

    print("Informe o primeiro valor: ")
    val a = readlnOrNull()?.toBooleanStrictOrNull()?: true

    print("Informe o segundo valor: ")
    val b = readlnOrNull()?.toBooleanStrictOrNull()?: true

    println("Operador E")//poderia ser utilizado o "&&"
    println()
    if (a.and(b)== false){
        println("Ambos são Falsos")
    }
    if (a.and(b)==true){
        println("Ambos são Verdadeiro")
    }

}


