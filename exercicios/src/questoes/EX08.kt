package questoes




fun main() {

    println("A seguir informe valores inteiros")

    print("Informe o primeiro valor: ")
    var a= readlnOrNull()?.toIntOrNull()?:0

    print("Informe o segundo valor: ")
    var b= readlnOrNull()?.toIntOrNull()?:0

    print("Informe o terceiro valor: ")
    var c= readlnOrNull()?.toIntOrNull()?:0

    var  reserva = 0

    if (a<b){
        reserva =a
        a=b
        b= reserva
    }
    if (a<c){
        reserva =a
        a=c
        c=reserva
    }
    if (b<c){
        reserva = b
        b=c
        c=reserva
    }



    println("Valores em ordem decrescente: $a,$b,$c")



}