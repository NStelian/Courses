package ro.itschool.mvnbase.curs21.ModifyWithLampda;

import java.util.ArrayList;
import java.util.List;

public class ModifyWithLampda {
    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");
        System.out.println(modify(names, value -> "P" + value.toUpperCase()));
    }

    private static List<String> modify(List<String> names, ListFunction function) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            result.add(function.apply(name));
        }
        return result;
    }
}

