package ro.itschool.mvnbase.curs16.BCE;

import ro.itschool.mvnbase.curs15.Country;

public class CountryEvaluatorMain {
    public static void main(String[] args) throws BadCountryException {
        CountryEvaluator countryEvaluator = new CountryEvaluator();
        try {
            System.out.println(countryEvaluator.evaluate(new Country("Romania")));
            System.out.println(countryEvaluator.evaluate(new Country("Germany")));
        }catch (BadCountryException bce){
            System.out.println("The country that is bad is "+ bce.getCountry());
        }
    }
}
