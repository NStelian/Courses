package ro.itschool.mvnbase.curs9;

public class Child extends Parent {
    public Child() {
        super(10);
    }

    public Child(int age) {
        super(age);
    }

    @Override
    protected String say() {
        return "Child says something";
    }

    protected String say(String message, String voice) {
        return "Child says " + message + " with voice " + voice;
    }

    @Override
    protected void doSomething() {
        super.doSomething();
        System.out.println("Child: do something");
    }
    //poti sa adaugi parametrii dar nu poti sa schimbi return type-ul | poti sa o faci mai accesibila(public)

    @Override
    public String toString() {
        return "Child with age: " + getAge();
    }
}
