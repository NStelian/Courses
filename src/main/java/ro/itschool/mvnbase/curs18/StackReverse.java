package ro.itschool.mvnbase.curs18;

import java.util.Stack;

public class StackReverse {
    public String reverse(String word){
        Stack<Character> characters = new Stack<>();
        for (int i=0;i<word.length();i++){
            characters.push(word.charAt(i));
        }
        String drow="";
        for (int i=0;i<word.length();i++){
            drow+=characters.pop();
        }
        return drow;
    }
}
