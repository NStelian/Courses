package ro.itschool.mvnbase.curs21.PreJava8;

import java.util.ArrayList;
import java.util.List;

public class PreJava8 {
    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romea", "Alex", "Darius");

        System.out.println(findName(names, new StartWithPredicate("A")));
        System.out.println(findName(names, new EqualPredicate("Adrian")));

        System.out.println(findName(names, new ListPredicate() {
            @Override
            public boolean applyCondition(String name) {
                return name.equals("Adrian");
            }
        }));

        System.out.println(findName(names, new ListPredicate() {
            @Override
            public boolean applyCondition(String name) {
                return name.length()==4;
            }
        }));
    }

    private static List<String> findName(List<String> names, ListPredicate predicate) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (predicate.applyCondition(name)) {
                result.add(name);
            }
        }
        return result;
    }

}

