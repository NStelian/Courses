package ro.itschool.mvnbase.curs18;

public class PalindromeOneIndex implements Palindrome {

    public boolean check(String word) {
        if (word == null) {
            return false;
        }
        word = word.toLowerCase();
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
