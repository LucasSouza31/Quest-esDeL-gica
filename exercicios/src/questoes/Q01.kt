package questoes

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma
//entre A e B e mostre se a soma é menor que C

fun main() {

    println("A seguir informe três valores")
    print("Informe o primeiro valor: ")
    val valorA = readlnOrNull()?.toIntOrNull()?:0
    print("Informe o segundo valor: ")
    val valorB = readlnOrNull()?.toIntOrNull()?: 0
    print("Informe o terceiro valor: ")
    val valorC= readlnOrNull()?.toIntOrNull() ?:0

    var soma = valorA+valorB

    println("A soma do primeiro valor com o segundo é ${soma}")

    if (soma < valorC) {
        println("A soma entre o ${valorA} e ${valorB} é igual a ${soma} e é menor que ${valorC}")
    }


}



