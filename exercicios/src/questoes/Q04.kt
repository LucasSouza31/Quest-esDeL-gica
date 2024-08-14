package questoes

//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o
//seu sucessor

fun main() {

    print("Informe um número: ")
    val valor = readlnOrNull()?.toIntOrNull() ?:0

    println("Antecessor:" +(valor-1)+ "sucessor :" + (valor +1) )

}

