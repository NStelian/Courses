package ro.itschool.mvnbase.curs15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CountryWriter {
    public final String file;
    private BufferedWriter writer;
    private boolean opened;

    public CountryWriter(String file) throws IOException {
        this.file = file;
        writer = new BufferedWriter(new FileWriter(file));
        this.opened = true;
    }

    private void writeCountry(Country country, boolean doFlush) throws IOException {
        if (!opened) {
            writer = openWithAppend();
        }
        writer.write(String.format("The country of %s has capital in %s with a population of %s on an area of %s km2",
                country.getName(), country.getCapital(), country.getPopulation(), country.getArea()));
        writer.newLine();
        if (doFlush) {
            writer.flush();
        }
    }

    public void writeCountry(List<Country> countries) throws IOException {
        for (Country country : countries) {
            writeCountry(country, false);
        }
        writer.flush();
    }

    public void writeCountry(Country country) throws IOException {
        writeCountry(country, true);
    }

    private BufferedWriter openWithAppend() throws IOException {
        return new BufferedWriter(new FileWriter(file, true));
    }

    public void closeWriter() throws IOException {
        writer.close();
        opened = false;
    }
}
