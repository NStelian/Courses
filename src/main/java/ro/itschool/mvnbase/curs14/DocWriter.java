package ro.itschool.mvnbase.curs14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DocWriter {
    private final String file;
    private BufferedWriter writer;
    private boolean opened;

    public DocWriter(String file) throws IOException {
        this.file=file;
        this.writer = new BufferedWriter(new FileWriter(file));
        this.opened = true;
    }

    public void writeDocument(Document document) throws IOException {
        if (!opened){
            writer=openWithAppend();
        }
        //writer.write(document.getDocumentId() + "|" + document.getName() + "|" + document.getContent());
        writer.write((String.format("%s|%s|%s", document.getDocumentId(), document.getName(), document.getContent())));
        writer.newLine();
        writer.flush();
    }

    public void writeListDocument(List<Document> documents) throws IOException {
        for (Document document:documents){
            writeDocument(document);
        }
    }

    private BufferedWriter openWithAppend() throws IOException {
        return new BufferedWriter(new FileWriter(file,true));
    }

    public void closeWriter() throws IOException {
        writer.close();
        opened = false;
    }
}
