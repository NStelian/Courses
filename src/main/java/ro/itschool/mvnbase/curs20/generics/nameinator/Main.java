package ro.itschool.mvnbase.curs20.generics.nameinator;

public class Main {
    public static void main(String[] args) {
        Cutie cutie1 = new Cutie();
        System.out.println(cutie1.getName());

        Nameinator<Cutie> nameinator = new Nameinator<>();
        nameinator.nameMe(cutie1);
        System.out.println(cutie1.getName());
        nameinator.nameMe(cutie1);
        System.out.println(cutie1.getName());
    }
}
