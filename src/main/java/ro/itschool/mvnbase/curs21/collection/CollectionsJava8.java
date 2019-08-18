package ro.itschool.mvnbase.curs21.collection;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionsJava8 {
    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");

        names.forEach(name-> System.out.println(name));

        names.stream()
                .filter(name->name.startsWith("A"))
                .forEach(name-> System.out.println(name));

        final List<Person> persons = names.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length()==4)
                .map(name -> new Person(name,0))
                .collect(Collectors.toList());

        System.out.println(persons);
    }
}
