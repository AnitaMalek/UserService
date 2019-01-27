package sda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Countries {

    private Set<Country> countries = new HashSet<>();

    public void addCountries(Country name) {
        if (countries.contains(name)) {
            System.out.println("Jest już taki kraj w zbiorze");
        } else {
            countries.add(name);
        }
    }

    public Set<Country> getAllCountries() {
        return countries;
    }

    public void removeCountry(Country name) {
        if (countries.contains(name)) {
            countries.remove(name);
        } else {
            System.out.println("Nie ma takiego kraju na liście!");
        }
    }

    public void updateCountry(Country oldCountry, Country newCountry){
        if (countries.contains(oldCountry)){
countries.remove(oldCountry);
countries.add(newCountry);}
    }

    public Set<Country> getCountryName(){
        return countries;
    }


}

