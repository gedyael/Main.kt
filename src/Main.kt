// mostrar mensagem
fun mostrarmensagem(message: String): Unit {                               // 1
    println(message)

}
// mostrando mensagem com prefixo info
fun mostrarmensagemcomprefixo(mesagem: String, prefixo: String = "Teste") {  // 2
    println("[$prefixo] $mesagem")
}

// soma retornando com inteiro
fun soma (n1: Int, n2: Int): Int {
    return n1 + n2
}

//multiplicaçao com apenas uma linha de codigo sem retornar o inteiro
fun multiplicação (n1: Int, n2: Int)= n1 * n2

// função principal main onde sera definido valores.
fun main() {
    mostrarmensagem("olá mundo")
    mostrarmensagemcomprefixo("olá", "mundo")
    mostrarmensagemcomprefixo("olá")
    mostrarmensagemcomprefixo(prefixo = "mundo", mesagem = "olá")
    println(soma(1, 2))
    println(multiplicação(2, 4))
}