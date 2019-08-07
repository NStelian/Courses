package ro.itschool.mvnbase.curs18;

public class PalindromRecursion implements Palindrome {

    @Override
    public boolean check(String word) {
        if (word == null) {
            return true;
        } else if (word.equals("") || word.length() == 1) {
            return false;
        } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return check(word.substring(1, word.length() - 2));
        }else{
            return false;
        }
    }
}
