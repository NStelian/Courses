package ro.itschool.mvnbase.curs15;

import java.util.List;

public class CountryReaderApiMain {
    public static void main(String[] args) {
        List<Country> countries = new CountryReaderApi().getCountries();
        System.out.println(countries);
        CountryStatistics countryStatistics = new CountryStatistics(countries);
        System.out.println(countryStatistics.getCountryWithBorder("ROU"));
        System.out.println(countryStatistics.getCountryWithSameLanguage("Romanian"));
    }
}
