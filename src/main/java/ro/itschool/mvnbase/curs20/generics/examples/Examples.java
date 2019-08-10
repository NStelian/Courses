package ro.itschool.mvnbase.curs20.generics.examples;

public class Examples {
    public static void main(String[] args) {
        final Box<Carte> cutie = new Box<>(new Carte());
        final Box<Cd> cutieCuCD = new Box<>(new Cd());
        Carte content = cutie.getContent();
        Cd cd = cutieCuCD.getContent();
        Pair<String, Dog> carte = new Pair<>("carte", new Dog());
        Pair<Dog, Cd> docCd = new Pair<>(new Dog(), new Cd());
    }
}
