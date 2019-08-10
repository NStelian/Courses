package ro.itschool.mvnbase.curs20.generics.myList;

public class MyList<T> {
    private T[] values;
    private int size;

    public MyList() {
        this.values = (T[]) new Object[10];
        this.size = 0;
    }

    public T get(int index) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException("Index > size");
        }
        return values[index];
    }

    public void add(T item) {
        addCapacity();
        values[size] = item;
        size++;
    }

    public int size() {
        return size;
    }

    private void addCapacity() {
        if (size == values.length) {
            T[] copy = values;
            values = (T[]) new Object[size + 10];
            for (int i = 0; i < 10; i++) {
                values[i] = copy[i];
            }
        }
    }
}
