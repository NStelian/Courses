package ro.itschool.mvnbase.curs20.generics.examples;

class Box<T extends Boxable> {
    private final T content;

    public Box(T content) {
        this.content = content;
    }

    public String box() {
        return content.boxMe();
    }

    public T getContent() {
        return content;
    }
}
