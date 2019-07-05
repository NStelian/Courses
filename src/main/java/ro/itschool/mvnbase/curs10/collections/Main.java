package ro.itschool.mvnbase.curs10.collections;

import ro.itschool.mvnbase.curs9.Parent;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Ana");
        words.add("are");
        words.add("mere");
        words.add("multe");
        words.add("mere");
        words.add("si");
        words.add("pere");
        words.add("Ana");
        words.add("si");
        words.add("Maria");
        words.add("si");
        words.add("Ionut");

        List<String> result = duplicateWord("mere", words);
        System.out.println(result);

        List<String> result2 = removeWord("mere", words);
        System.out.println(result2);

        //removeWordRef("Ana", words);
        System.out.println(words);

        //System.out.println(uniqueElements(words));

        System.out.println(uniqueElements2(words));
    }

    public static List<String> duplicateWord(String word, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String element : words) {
            result.add(element);
            if (element.equals(word)) {
                result.add(element);
            }
        }
        return result;
    }

    public static List<String> removeWord(String word, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String element : words) {
            if (!element.equals(word)) {
                result.add(element);
            }
        }
        return result;
    }

    public static void removeWordRef(String word, List<String> words) {
        Iterator<String> wordIterator = words.iterator();
        while (wordIterator.hasNext()) {
            String next = wordIterator.next();
            if (next.equals(word)) {
                wordIterator.remove();
            }
        }
    }

    public static Set<String> uniqueElements(List<String> words) {
        Set<String> result = new HashSet<>();
        for (String element : words) {
            result.add(element);
        }
        return result;
    }

    // SAU new HashSet<>(words) =)

    public static List<String> uniqueElements2(List<String> words){
        List<String> result = new ArrayList<>();
        for (String element : words){
            if(!result.contains(element)){
                result.add(element);
            }
        }
        return result;
    }
}
