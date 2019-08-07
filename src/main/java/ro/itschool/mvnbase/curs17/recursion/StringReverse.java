package ro.itschool.mvnbase.curs17.recursion;

public class StringReverse {
    public String reverse(String word) {
        if (word.equals("")) {
            return "";
        } else {
            return word.charAt(word.length() - 1) + reverse(word.substring(0, word.length() - 1));
        }
    }

    public String reverse2(String word) {
        if (word.equals("")) {
            return "";
        } else {
            return reverse2(word.substring(1)) + word.charAt(0);
        }
    }
}
