package ro.itschool.mvnbase.curs15;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CountryStatistics {
    private final List<Country> countries;

    public CountryStatistics(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getAllCountries() {
        return countries;
    }

    public List<Country> getCountriesStartingWithLetter(String letter) {
        List<Country> result = new ArrayList<>();
        for (Country country : countries) {
            if (country.getName().startsWith(letter)) {
                result.add(country);
            }
        }
        return result;
    }

    public Optional<String> getCountryCapital(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return Optional.of(country.getCapital());
            }
        }
        return Optional.empty();
    }

    public Optional<Long> getPopulation(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return Optional.of(country.getPopulation());
            }
        }
        return Optional.empty();
    }

    public Optional<Integer> getArea(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return Optional.of(country.getArea());
            }
        }
        return Optional.empty();
    }

    public Optional<Country> getLargestCountry() {
        int largestArea = 0;
        Country largestCountry = null;
        for (Country country : countries) {
            if (country.getArea() >= largestArea) {
                largestArea = country.getArea();
                largestCountry = country;
            }
        }
        return Optional.ofNullable(largestCountry);
    }

    public Optional<Country> getMostPeopleCountry() {
        long mostPeople = 0;
        Country countryMostPeople = null;
        for (Country country : countries) {
            if (country.getPopulation() >= mostPeople) {
                mostPeople = country.getPopulation();
                countryMostPeople = country;
            }
        }
        return Optional.ofNullable(countryMostPeople);
    }

    public Optional<Country> getMostDenseCountry() {
        double dense = Double.MAX_VALUE;
        Country mostDenseCountry = null;
        for (Country country : countries) {
            double crtDense = (double) country.getArea() / country.getPopulation();
            if (crtDense <= dense) {
                dense = crtDense;
                mostDenseCountry = country;
            }
        }
        return Optional.ofNullable(mostDenseCountry);
    }

    public List<Country> getCountryWithBorder(String border) {
        List<Country> result = new ArrayList<>();
        for (Country country : countries) {
            if (country.getBorders().contains(border)) {
                result.add(country);
            }
        }
        return result;
    }

    public List<Country> getCountryWithSameLanguage(String language) {
        List<Country> result = new ArrayList<>();
        for (Country country : countries) {
            for (Language language1 : country.getLanguages()) {
                if (language1.getName().equals(language)) {
                    result.add(country);
                }
            }
        }
        return result;
    }
}
