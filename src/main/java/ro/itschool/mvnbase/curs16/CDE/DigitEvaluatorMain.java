package ro.itschool.mvnbase.curs16.CDE;

public class DigitEvaluatorMain {
    public static void main(String[] args) throws TooLongException {
        DigitEvaluator digitEvaluator = new DigitEvaluator();
        try {
            System.out.println(digitEvaluator.evaluate(null));
            System.out.println(digitEvaluator.evaluate("12412534512123"));
            System.out.println(digitEvaluator.evaluate(""));
            System.out.println(digitEvaluator.evaluate("abc"));
        } catch (CustomDigitException cde) {
            System.out.println("The number that is bad is " + cde.getNumber());
        } catch (TooLongException tle) {
            System.out.println("The number that is too long is " + tle.getNumber());
        }
    }

}
