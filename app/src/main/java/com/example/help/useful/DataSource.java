package com.example.help.useful;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public List<City> getListCities(){

        City city1 = new City(null, "Trip 1", "Destination 1", "200RON", true);
        City city2 = new City(null, "Trip 1", "Destination 1", "200RON", true);
        City city3 = new City(null, "Trip 1", "Destination 1", "200RON", true);
        City city4 = new City(null, "Trip 1", "Destination 1", "200RON", true);
        City city5 = new City(null, "Trip 1", "Destination 1", "200RON", true);
        City city6 = new City(null, "Trip 1", "Destination 1", "200RON", true);
        City city7 = new City(null, "Trip 1", "Destination 1", "200RON", true);
        City city8 = new City(null, "Trip 1", "Destination 1", "200RON", true);


        List<City> cities = new ArrayList<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);
        cities.add(city6);
        cities.add(city7);
        cities.add(city8);

        return cities;
    }

}
