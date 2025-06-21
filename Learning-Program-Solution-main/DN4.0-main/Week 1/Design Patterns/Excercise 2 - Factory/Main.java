public class Main {
    public static void main(String[] args) {
        
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.displayContent();

        
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.displayContent();

        
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.displayContent();
    }
}
