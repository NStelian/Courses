package ro.itschool.mvnbase.curs18;

public class PalindromeTwoIndex implements Palindrome {
    public boolean check(String word) {
        if (word == null) {
            return false;
        }
        word = word.toLowerCase();
        int index1 = 0;
        int index2 = word.length() - 1;

        while (index1 != word.length() / 2) {
            if (word.charAt(index1) != word.charAt(index2)) {
                return false;
            }
            index1++;
            index2--;
        }
        return true;
    }
}
