package ro.itschool.mvnbase.curs17.recursion;

public class Sum {
    public int sum(int n){
        if(n==0){
            return 0;
        }else{
            return n+sum(n-1);
        }
    }
}
