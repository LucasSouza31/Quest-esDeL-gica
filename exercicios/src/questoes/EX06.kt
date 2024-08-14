package questoes


fun main() {

    println("Informe um valor")
    val valor = readlnOrNull()?.toDoubleOrNull()?:0.0

    val reajuste = valor * 1.05

    println("O valor reajustado é: ${reajuste}")
}

