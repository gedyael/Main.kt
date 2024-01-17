class Mutablepilha<E>(vararg intens : E) {                      //1 criando classe com paramentos genericos "E", fazendo com o tipo dele seja qualquer coisa

    private val elementos = intens.toMutableList()              //2 propriedade criada convertando para "toMutablelis()

    fun push(elemento: E) = elementos.add(elemento)              //3- adicionando intem lista

    fun peek(): E = elementos.last()                             //4-  pega o ultimo elemento sem remoção

    fun pop(): E = elementos.removeAt(elementos.size - 1)  //5- removendo da lista

    fun isEmpty() = elementos.isEmpty()                          //4- verificar se a lista ta vazia

    fun size() = elementos.size                                  //5- verificar o tamanho da lista

    override fun toString() = "Mutablepilha(${elementos.joinToString()})"  

}



fun main() {
    val pilha = Mutablepilha(0.34, 3.14, 2.7)
    pilha.push(9.29)
    println(pilha)

    println("peek(): ${pilha.peek()}")
    println(pilha)

    for (i in 1.. pilha.size()){
        println("pop(): ${pilha.pop()}")
        println(pilha)
    }
}
