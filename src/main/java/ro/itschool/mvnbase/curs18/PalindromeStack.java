package ro.itschool.mvnbase.curs18;

import java.util.Stack;

public class PalindromeStack implements Palindrome{
    @Override
    public boolean check(String word) {
        if (word == null) {
            return false;
        }
        if (word.equals("")) {
            return true;
        }
        word = word.toLowerCase();

        StackReverse stackReverse = new StackReverse();
        if(word.equals(stackReverse.reverse(word))){
            return true;
        }
        return false;
    }
}
