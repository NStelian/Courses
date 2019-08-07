package ro.itschool.mvnbase.curs17.recursion;

public class Pow {
    public int pow(int b,int p){
        if(p==0){
            return 1;
        }else {
            return (int) (b*Math.pow(b,p-1));
        }
    }
}
