package templatemethod

abstract class DocumentProcessor {
    fun processDocument(filePath: String) {
        openFile(filePath)
        extractData()
        generateReport()
        closeFile()
    }

    private fun openFile(filePath: String) {
        println("Abrindo o arquivo: $filePath")
    }

    private fun generateReport() {
        println("Relatório gerado.")
    }

    private fun closeFile() {
        println("Arquivo fechado.")
    }

    abstract fun extractData()
}
