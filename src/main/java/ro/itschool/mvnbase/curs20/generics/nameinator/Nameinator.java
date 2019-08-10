package ro.itschool.mvnbase.curs20.generics.nameinator;

import java.util.List;
import java.util.Random;

public class Nameinator<N extends Nameable> {
    private final List<String> names;
    private Random random;

    public Nameinator() {
        this.names = List.of("Steli", "Charlie", "Sebi", "Ana", "Maria", "Patri");
        this.random = new Random();
    }

    public N nameMe(N obj) {
        obj.setName(names.get(random.nextInt(names.size())));
        return obj;
    }
}
