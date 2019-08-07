package ro.itschool.mvnbase.curs18;

public class StringReverse {
    public String reverse(String word) {
        if (word.equals("")) {
            return "";
        } else {
            return reverse(word.substring(1)) + word.charAt(0);
        }
    }
}
