package templatemethod

class TxtProcessor : DocumentProcessor() {
    override fun extractData() {
        println("Extraindo dados do TXT: [conteúdo do TXT]")
    }
}
