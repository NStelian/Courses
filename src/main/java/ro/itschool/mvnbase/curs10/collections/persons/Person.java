package ro.itschool.mvnbase.curs10.collections.persons;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String hairColor;

    public Person(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public boolean equals(Object person) {
        if (((Person) person).name.equals(this.name)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.name;
    }
}
