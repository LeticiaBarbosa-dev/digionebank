package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val diego = Cliente(
        nome = "Diego Arthur",
        cpf = "145.145.145.88",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(diego)

    TesteAutenticacao().autentica(diego)
}