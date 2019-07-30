package ro.itschool.mvnbase.curs12;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        DocSource docSource = new FileLineDocSource("src/main/resources/doc.in");

        testDocumentService(docSource);

        DocSource docSource2 = new FileSplitDocSource("src/main/resources/doc2.in");

        testDocumentService(docSource2);
    }

    private static void testDocumentService(DocSource docSource) {
        DocumentService service = new DocumentService(docSource.getDocuments());
        service.addMarkup(service.getAllDocuments().get(0).getDocumentId(), new Markup("1", "3", "da"));
        System.out.println(service.getAllDocuments());
    }
}
