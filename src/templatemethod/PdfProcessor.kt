package templatemethod

class PdfProcessor : DocumentProcessor() {
    override fun extractData() {
        println("Extraindo dados do PDF: [conteúdo do PDF]")
    }
}
