package questoes

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem
//iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de
//qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor
//na tela.

fun main() {

    var resultado = 0

    println("A seguir informe dois valores")
    print("informe o primeiro valor: ")
    val valorA= readlnOrNull()?.toIntOrNull() ?:0
    print("informe o segundo valor: ")
    val valorB= readlnOrNull()?.toIntOrNull() ?:0



    if (valorA == valorB){
         resultado = valorA+valorB
        println("O resultado da soma é ${resultado}")
    }

    if (valorA != valorB){
        resultado= valorA*valorB
        println("O resultado da multiplicação é ${resultado}")
    }





}
