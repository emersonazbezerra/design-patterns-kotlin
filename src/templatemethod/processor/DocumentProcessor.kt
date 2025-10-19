package templatemethod.processor

// Classe base que define esqueleto do algoritmo (Template Method)
abstract class DocumentProcessor {
    // processDocument é o nosso Template Method
    fun processDocument(filePath: String) {
        openFile(filePath)
        extractData()
        generateReport()
        closeFile()
    }

    private fun openFile(filePath: String) {
        println("Abrindo o arquivo: $filePath")
    }

    private fun closeFile() {
        println("Arquivo fechado.")
    }

    private fun generateReport() {
        println("Relatório gerado.")
    }

    // Passo a ser implementado
    abstract fun extractData()
}
