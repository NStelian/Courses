package ro.itschool.mvnbase.curs17.recursion;

public class StringLenght {
    public int stringLenght(String word){
        if(word.equals("")){
            return 0;
        }else{
            return 1+stringLenght(word.substring(1));
        }
    }
}
