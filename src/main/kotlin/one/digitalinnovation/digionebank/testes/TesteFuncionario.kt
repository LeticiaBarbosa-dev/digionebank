package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val leticia = Pessoa("Letícia Barbosa", "125.125.125-00")
    println(leticia.nome)
    println(leticia.cpf)

    val pedro = Funcionario("Pedro Barbosa", "126.126.126-09", BigDecimal.valueOf(8600))
    println(pedro.nome)
    println(pedro.cpf)
    println(pedro.salario)
}