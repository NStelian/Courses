package ro.itschool.mvnbase.curs17.recursion;

public class StringReverseMain {
    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        System.out.println(sr.reverse("word"));

        System.out.println(sr.reverse2("word"));
    }
}
