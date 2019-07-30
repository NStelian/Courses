package ro.itschool.mvnbase.curs16.CDE;

public class CustomDigitException extends Exception {
    private final String number;

    public CustomDigitException(String number) {
        super("This is not a number");
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
