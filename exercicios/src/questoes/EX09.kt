package questoes


//Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o
//seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:


fun main() {

    println("CÁLCULO DE IMC")

    print("Informe seu peso: ")
    val peso= readlnOrNull()?.toDoubleOrNull()?: 0.0

    print("Informe sua altura: ")
    val altura = readlnOrNull()?. toDoubleOrNull()?: 0.0

    var IMC = peso/(altura*altura)


//    println("Seu IMC é ${IMC}")

    val resultado = when {
        IMC <= 18.5 -> "Abaixo do peso"
        IMC in 18.6..24.9 -> "no Peso ideal"
        IMC in 25.0..29.9 -> "Levemente acima do peso"
        IMC in 30.0.. 34.9 -> "em Obesidade grau I"
        IMC in 35.0.. 39.9 -> "em Obesidade grau II"
        IMC >= 40.0 -> "em Obesidade grau III(mórbida)"
        else -> "Valor inválido"
    }

    println("O resultado do IMC é ${"%.1f".format(IMC)} e está ${resultado}")




}

