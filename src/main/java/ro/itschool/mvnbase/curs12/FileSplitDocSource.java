package ro.itschool.mvnbase.curs12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSplitDocSource implements DocSource {
    private final List<Document> documents;

    public FileSplitDocSource(String path) throws IOException {
        this.documents = fetchDocument(path);
    }

    private List<Document> fetchDocument(String path) throws IOException {
        List<Document> result = new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader(path));

        String line;
        while ((line = breader.readLine()) != null) {
            String[] splits = line.split("~");
            result.add(new Document(splits[0], splits[1]));
        }
        return result;
    }

    @Override
    public List<Document> getDocuments() {
        return documents;
    }
}
