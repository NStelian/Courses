package ro.itschool.mvnbase.curs16.CDE;

public class TooLongException extends Exception {
    private final String number;

    public TooLongException(String digit) {
        super("The number is not an int");
        this.number = digit;
    }

    public String getNumber() {
        return number;
    }
}
