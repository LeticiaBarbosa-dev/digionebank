package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Letícia"
    var cpf: String = "125.125.125-00"

    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}

fun main() {
    val leticia = Pessoa()

    println(leticia.pessoaInfo())
}