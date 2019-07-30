package ro.itschool.mvnbase.curs16.CDE;

public class DigitEvaluator {
    public int evaluate(String numberChecked) throws CustomDigitException, TooLongException {
        if (numberChecked == null || numberChecked.isEmpty()) {
            throw new CustomDigitException(numberChecked);
        }
        for (int i = 0; i < numberChecked.length(); i++) {
            if (!Character.isDigit(numberChecked.charAt(i))) {
                throw new CustomDigitException(numberChecked);
            }
        }

        if (numberChecked.length() > 10) {
            throw new TooLongException(numberChecked);
        }

        return Integer.parseInt(numberChecked);
    }
}
