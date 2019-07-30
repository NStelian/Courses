package ro.itschool.mvnbase.curs11;

import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person(1, "Steli", 21, "student", 8000),
                new Person(2, "Cipri", 81, "student", 10),
                new Person(3, "Csaki", 21, "jew", -1),
                new Person(4, "Coca", 22, "mechanic", 3500),
                new Person(5, "Misu", 23, "it", 3500)
        );

        PersonService personService = new PersonService(personList);

        System.out.println(personService.getAll());
        System.out.println(personService.getById(2));
        System.out.println(personService.getByName("Steli"));
        System.out.println(personService.getByOccupation("student"));
        System.out.println(personService.findBySalary(3500));
        System.out.println(personService.findOldestPerson());
        System.out.println(personService.mapOccupationToName());
    }
}
