package questoes

//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é
//par ou ímpar, positivo ou negativo


fun main() {


    print("A seguir informe um número: ")
    val valor = readlnOrNull()?.toIntOrNull()

    if (valor != null){
            if (valor % 2 == 0) {
                println("O número informado é par")
            }

            if (valor > 0) {
                println("O número informado é positivo")
            }else if (valor < 0){
                println("O número negativo")
            }
    }


}


