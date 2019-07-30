package ro.itschool.mvnbase.curs12;

import java.util.Objects;

public class Markup {
    private final String markupId;
    private final String position;
    private final String content;

    public Markup(String markupId, String position, String content) {
        this.markupId = markupId;
        this.position = position;
        this.content = content;
    }

    public String getMarkupId() {
        return markupId;
    }

    public String getPosition() {
        return position;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Markup markup = (Markup) o;
        return Objects.equals(markupId, markup.markupId) &&
                Objects.equals(position, markup.position) &&
                Objects.equals(content, markup.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markupId, position, content);
    }

    @Override
    public String toString() {
        return "Markup{" +
                "markupId='" + markupId + '\'' +
                ", position='" + position + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
