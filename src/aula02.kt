
fun main() {

        fun MOSTRAMENSAGEN(vararg mensagen: String) {
            for (i in mensagen) println(i)
        }
        MOSTRAMENSAGEN("BOM DIA", "BOA TARDE", "BOA NOITE")

        fun mostrartudocomprefixo(vararg mensagen: String, prefixo: String) {
            for (i in mensagen) println (prefixo + i) }

        mostrartudocomprefixo(
            "BOM DIA", "BOA TARDE", "BOA NOITE",
                    prefixo = "Olá:"
        )

        fun teste(vararg mensagen:String){
            MOSTRAMENSAGEN(*mensagen)
        }
        teste("Bom dia", "Boa tarde", "Boa noite",)
}

