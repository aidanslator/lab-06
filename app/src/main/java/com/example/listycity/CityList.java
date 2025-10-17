package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * This class holds the City type objects in a list
 *
 */
public class CityList {
    private List<City> cities = new ArrayList<>();


    /**
     * This method adds a city to the city list
     * @param city
     *              This is a city object we want to ad to the list
     * @throws IllegalArgumentException if the city is already in the list
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     * This method gets the list of cities
     * @return list of cities
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This method checks if the cityList contains another city
     * @param city
     *      This is the city to check
     * @return
     *      a boolean corresponding to whether the city is in the list
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * This method deletes a specified city in the list
     * @param city
     *    The city to delete
     */
    public void delete(City city){
        if(hasCity(city)){
            cities.remove(city);
        }else{
            throw new IllegalArgumentException();
        }
    }

    /**
     * Counts the cities in the list
     * @return
     *  Returns the number of cities in the list
     */
    public int countCities(){
        return cities.size();
    }



}

