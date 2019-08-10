package ro.itschool.mvnbase.curs20.generics.nameinator;

public class Cutie implements Nameable {
    private String name;

    public Cutie() {
        this.name = "Name";
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }
}
