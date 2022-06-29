package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val pedro = Gerente("Pedro Barbosa", "126.126.126-09", 2000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(pedro)

    TesteAutenticacao().autentica(pedro)
}
