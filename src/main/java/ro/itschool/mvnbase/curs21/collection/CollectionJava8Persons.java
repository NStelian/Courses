package ro.itschool.mvnbase.curs21.collection;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionJava8Persons {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Nitu", 10),
                new Person("Steli", 19),
                new Person("Mircea", 21),
                new Person("Iohan", 11)
        );

        List<String> majorPersonsNames = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .map(person -> person.getName())
                .collect(Collectors.toList());

        System.out.println(majorPersonsNames);

        List<String> minorPersonsStartsWith = persons.stream()
                .filter(person -> person.getAge() <= 18)
                .map(person -> person.getName())
                .filter(name -> name.startsWith("N"))
                .collect(Collectors.toList());

        System.out.println(minorPersonsStartsWith);

    }
}
