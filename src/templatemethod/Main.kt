package templatemethod

import templatemethod.processor.PdfProcessor
import templatemethod.processor.TxtProcessor

fun main() {
    println("--- Processando PDF ---")

    val pdfProcessor = PdfProcessor()
    pdfProcessor.processDocument("documentos/arquivo.pdf")

    println("\n--- Processando TXT ---")

    val txtProcessor = TxtProcessor()
    txtProcessor.processDocument("documentos/arquivo.txt")
}
