package ro.itschool.mvnbase.curs9;

public class Parent {

    static String prefix = "mr";
    static final String CONSTANT = "This is it";

    private int age;

    public Parent(int age) {
        this.age = age;
    }

    public Parent() {
        this(11);
    }

    protected final String order() {
        return "Make your bed!";
    }

    protected String say(String message) {
        return "Parent says " + message;
    }

    protected String say() {
        return say("something");
    }


    protected void doSomething() {
        System.out.println("Parent: do something");
    }

    public int getAge() {
        return age;
    }

    public int hashCode() {
        return age % 3;
    }

    public boolean equals(Object anotherParent) {
        System.out.println("Comparing " + this + " with " + anotherParent);
        if (this.getClass().equals(anotherParent.getClass())) {
            if (((Parent) anotherParent).age == this.age) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Parent with age: " + age;
    }
}
