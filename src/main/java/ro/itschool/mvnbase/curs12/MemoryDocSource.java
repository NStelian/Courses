package ro.itschool.mvnbase.curs12;

import java.util.List;

public class MemoryDocSource implements DocSource {
    @Override
    public List<Document> getDocuments() {
        return List.of(
                new Document("1", "content1", "name1"),
                new Document("2", "content2", "name2"),
                new Document("3", "content3", "name3"),
                new Document("4", "content4", "name4"),
                new Document("5", "content5", "name5")
        );
    }
}
