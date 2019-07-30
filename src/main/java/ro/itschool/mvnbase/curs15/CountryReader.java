package ro.itschool.mvnbase.curs15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class CountryReader {
    private final List<Country> countries;

    public CountryReader(String path) throws IOException {
        this.countries = fetchCountries(path);
    }

    private List<Country> fetchCountries(String path) throws IOException {
        List<Country> countriesMaker = new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = breader.readLine()) != null) {
            String[] country = line.split(Pattern.quote("|"));
            countriesMaker.add(new Country(country[0], country[1], Long.parseLong(country[2]),
                    Integer.parseInt(country[3]),"not available",new ArrayList<>(),new HashMap<>(),new ArrayList<>()));
        }
        return countriesMaker;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
