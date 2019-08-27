package ro.itschool.mvnbase.curs21.PostJava8;

import java.util.ArrayList;
import java.util.List;

public class PostJava8 {
    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");
        System.out.println(findNames(names, value -> value.equals("Alex")));
        System.out.println(findNames(names, value -> value.startsWith("A")));
        System.out.println(findNames(names, value -> value.length() == 4));
        System.out.println(findNames(names, value -> value.endsWith("n")));


    }

    private static List<String> findNames(List<String> names, AnotherListPredicate predicate) {
        List<String> result = new ArrayList<>();

        for (String name : names) {
            if (predicate.apply(name)) {
                result.add(name);
            }
        }
        return result;
    }
}

