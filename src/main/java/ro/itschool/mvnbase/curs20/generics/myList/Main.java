package ro.itschool.mvnbase.curs20.generics.myList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyList<String> stringMyList = new MyList<>();
        for (int i = 0; i < 21; i++) {
            stringMyList.add(String.valueOf(i));
        }
        System.out.println(stringMyList.size());
    }
}
