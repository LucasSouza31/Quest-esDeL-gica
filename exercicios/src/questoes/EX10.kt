package questoes


fun main() {


    println("A seguir informe três notas ")

    print("Informe a primeira nota: ")
    var nota1= readlnOrNull()?.toFloatOrNull()?: 0.0f
    print("Informe a segunda nota: ")
    var nota2= readlnOrNull()?.toFloatOrNull()?: 0.0f
    print("Informe a terceira nota: ")
    var nota3= readlnOrNull()?.toFloatOrNull()?: 0.0f

    var media = (nota1+nota2+nota3)/3

    println("Sua média é ${"%.1f".format(media)}")

}
