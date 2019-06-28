package ro.itschool.mvnbase.Curs6;

public class CalculatorTDD {
    public int add(int termen1, int termen2) {
        return termen1 + termen2;
    }

    public int division(int termen1, int termen2) {
        if (termen2 == 0) {
            return 0;
        } else {
            return termen1 / termen2;
        }
    }
}
