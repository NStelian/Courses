package ro.itschool.mvnbase.curs16;

public class Main {
    public static void main(String[] args) {
        try{
            metoda();
            System.out.println("nu se executa");
        }catch (RuntimeException rex){
            System.out.println("a aparut o problema");
        }finally {
            System.out.println("se executa indiferent");
        }
    }
    public static void metoda(){
        throw new RuntimeException("ceva nu e bine");
    }
}
