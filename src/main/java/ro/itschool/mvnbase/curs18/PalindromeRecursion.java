package ro.itschool.mvnbase.curs18;


public class PalindromeRecursion implements Palindrome {
    @Override
    public boolean check(String word) {
        if (word == null) {
            return false;
        }
        word = word.toLowerCase();
        StringReverse stringReverse = new StringReverse();
        if(word.equals(stringReverse.reverse(word))){
            return true;
        }
        return false;
    }
}
