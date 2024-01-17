class Mutablepilha<E>(vararg intens : E) {

    private val elementos = intens.toMutableList()

    fun push(elemento: E) = elementos.add(elemento)

    fun peek(): E = elementos.last()

    fun pop(): E = elementos.removeAt(elementos.size - 1)

    fun isEmpty() = elementos.isEmpty()

    fun size() = elementos.size

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
