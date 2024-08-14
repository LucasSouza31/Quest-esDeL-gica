package questoes

//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base
//para o Salário mínimo R$ 1.293,20)

fun main() {

    val salarioBase = 1293.2

    print("Informe seu salário: ")
    var salarioMinimo= readlnOrNull()?.toDoubleOrNull()?: 0.0

    if (salarioMinimo<salarioBase){
        println("Você ganha menos que um salário mínimo")
    }

    if (salarioMinimo == salarioBase)
        println("Você ganha um salário mínimo")


    if (salarioMinimo>salarioBase){
        var resultado = salarioMinimo/salarioBase
        println("Você ganha ${resultado} salários mínimos")
    }





}

