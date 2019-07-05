package ro.itschool.mvnbase.curs9;

public class Main {
    public static void main(String[] args) {

        //un base class poate fii initializat cu un subclass
        /*Parent parentChild = new Child();
        parentChild.doSomething();*/
        Child child = new Child();
        System.out.println(Child.prefix);
        Parent parent = new Parent();
        System.out.println(parent.prefix);
        child.prefix = "altceva";
        System.out.println(child.prefix);


        print(new Parent());
        print(new Child());
        System.out.println(child.say("over", "HIGH"));
        Parent pChild = new Child();
        print(pChild);
    }

    public static void print(Parent object) {
        System.out.println("---");
        object.doSomething();
        System.out.println(object.say());
        System.out.println(object.order());
        System.out.println(object.say("overloading"));

    }
}
