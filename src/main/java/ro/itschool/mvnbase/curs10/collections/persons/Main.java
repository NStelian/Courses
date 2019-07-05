package ro.itschool.mvnbase.curs10.collections.persons;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ion", 18, "black"),
                new Person("Vasile", 81, "brown"),
                new Person("Dege", 53, "gray"),
                new Person("Laslo", 42, "black"),
                new Person("Oros", 35, "brown"),
                new Person("Oros", 35, "brown")
        );

//        System.out.println(getPersonsNames(persons));
//
//        System.out.println(new HashSet<>(persons));
//
//
//        System.out.println(mapNameHair(persons));


        System.out.println(mapHairListName(persons));
    }

    public static List<String> getPersonsNames(List<Person> persons) {
        List<String> names = new ArrayList<>();
        for (Person element : persons) {
            names.add(element.getName());
        }
        return names;
    }

    public static Map<String, String> mapNameHair(List<Person> persons){
        Map<String, String> mapString = new HashMap<>();
        for (Person element : persons) {
            mapString.put(element.getName(), element.getHairColor());
        }
        return mapString;
    }

    public static Map<String, List<String>> mapHairListName(List<Person> persons){
        Map<String,List<String>> mapHair = new HashMap<>();
        for (Person person : persons) {
            List<String> names = mapHair.get(person.getHairColor());
            if(names==null){
                names = new ArrayList<>();
                mapHair.put(person.getHairColor(),names);
            }
            names.add(person.getName());
        }
        return mapHair;
    }
}
