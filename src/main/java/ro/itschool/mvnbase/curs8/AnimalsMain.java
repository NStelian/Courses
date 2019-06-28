package ro.itschool.mvnbase.curs8;

public class AnimalsMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.voice());
        System.out.println(dog.noOfLimbs());
        dog.eat("meat");

        Cat cat = new Cat();
        System.out.println(cat.voice());
        System.out.println(cat.noOfLimbs());
        cat.eat("mouse");

        Bird bird = new Bird();
        System.out.println(bird.voice());
        System.out.println(bird.noOfLimbs());
        bird.eat("bread");
    }
}
