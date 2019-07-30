package ro.itschool.mvnbase.curs12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DocumentService {
    private final List<Document> documents;

    public DocumentService(List<Document> documents) {
        this.documents = documents;
    }

    public List<Document> getAllDocuments() {
        return new ArrayList<>(documents);
    }

    public Document getDocumentWithName(String name) {
        for (Document doc : documents) {
            if (doc.getName().equals(name)) {
                return doc;
            }
        }
        return null;
    }

    public Optional<Document> getDocumentById(String id) {
        for (Document doc : documents) {
            if (doc.getDocumentId().equals(id)) {
                return Optional.of(doc);
            }
        }
        return Optional.empty();
    }

    public void addMarkup(String docId, Markup markup) {
        Optional<Document> doc = getDocumentById(docId);
        if(doc.isPresent()){
            doc.get().addMarkup(markup);
        }else {
            System.out.println("Does't exist a document with that id");
        }
    }
}
