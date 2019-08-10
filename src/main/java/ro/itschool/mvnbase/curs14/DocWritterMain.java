package ro.itschool.mvnbase.curs14;

import java.io.IOException;

public class DocWritterMain {
    public static void main(String[] args) throws IOException {
        DocWriter docWriter = new DocWriter("src/Main/resources/docwriter.txt");
        for (int i=0;i<10;i++){
            docWriter.writeDocument(new Document("steli"+i,"steli"+i));
            docWriter.closeWriter();
        }
        docWriter.closeWriter();
    }
}
