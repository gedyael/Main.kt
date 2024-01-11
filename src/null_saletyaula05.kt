fun main () {

    var nulidade: String? = "entedendo valor nulo"
    nulidade = null

    println(nulidade)

    fun entrada1(ent: String?) : Int? {
        return ent?.length


    }
    entrada1(nulidade)
}