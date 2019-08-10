package ro.itschool.mvnbase.curs14;
import java.io.IOException;
import java.util.List;

public class RestDocSourceMain {
    public static void main(String[] args) throws IOException {
        DocWriter docWriter = new DocWriter("src/Main/resources/curs14/docWriterRest.txt");
        List<Document> documentList = new RestDocSource().getDocuments();
        System.out.println(documentList);
        for (Document document:documentList){
            docWriter.writeDocument(document);
        }

        DocWriter docWriter2 = new DocWriter("src/Main/resources/curs14/docWriterRest2.txt");
        docWriter2.writeListDocument(documentList);
    }
}
