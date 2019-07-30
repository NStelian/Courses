package ro.itschool.mvnbase.curs11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {
    private final List<Person> persons;

    PersonService(List<Person> persons) {
        if (persons == null) {
            this.persons = new ArrayList<>();
        } else {
            this.persons = persons;
        }
    }

    public List<Person> getAll() {
        return new ArrayList<>(persons);
    }

    public Person getById(int id) {
        Person idPerson = null;
        for (Person person : persons) {
            if (person.getId() == id) {
                idPerson = person;
            }
        }
        return idPerson;
    }

    public Person getByName(String name) {
        Person namePerson = null;
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                namePerson = person;
            }
        }
        return namePerson;
    }

    public List<Person> getByOccupation(String occupation) {
        List<Person> oPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getOccupation().equals(occupation)) {
                oPersons.add(person);
            }
        }
        return oPersons;
    }

    public List<Person> findBySalary(int salary) {
        List<Person> sPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getSalary() == salary) {
                sPersons.add(person);
            }
        }
        return sPersons;
    }

    public Person findOldestPerson() {
        int age = 0;
        Person oldestPerson = null;
        for (Person person : persons) {
            if (person.getAge() > age) {
                age = person.getAge();
                oldestPerson = person;
            }
        }

        return oldestPerson;
    }

    public Map<String, List<Person>> mapOccupationToName() {
        Map<String, List<Person>> mapOccupation = new HashMap<>();
        for (Person person : persons) {
            List<Person> persons = mapOccupation.get(person.getOccupation());
            if (persons == null) {
                persons = new ArrayList<>();
                mapOccupation.put(person.getOccupation(), persons);
            }
            persons.add(person);
        }
        return mapOccupation;
    }

}
