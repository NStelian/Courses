package ro.itschool.mvnbase.curs15;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CountryReader countryReader = new CountryReader("src/main/resources/curs15/countries.txt");
        System.out.println(countryReader.getCountries());
        CountryStatistics countryStatistics = new CountryStatistics(countryReader.getCountries());
        System.out.println(countryStatistics.getCountriesStartingWithLetter("Z"));
        System.out.println(countryStatistics.getCountryCapital("Belarus"));
        System.out.println(countryStatistics.getPopulation("Zimbabwe"));
        System.out.println(countryStatistics.getArea("Zimbabwe"));
        System.out.println(countryStatistics.getLargestCountry());
        System.out.println(countryStatistics.getMostPeopleCountry());
        System.out.println(countryStatistics.getMostDenseCountry());

        CountryWriter countryWriter = new CountryWriter("src/main/resources/curs15/countriesWriter.txt");
        countryWriter.writeCountry(countryReader.getCountries());
    }
}
