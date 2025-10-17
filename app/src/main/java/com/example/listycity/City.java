package com.example.listycity;

import androidx.annotation.Nullable;

/**
 * This class models a city. Each city has a name and a province
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name
     * @return
     *      returns the city name
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city name
     * @param city
     *      the new city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the province
     * @return
     *      Returns the province abbreviation
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the province
     * @param province
     *      the new province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method compares two cities
     * @param o the object to be compared.
     * @return 0, <1 or >1 if two values are equal, a<b, or a>b
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCity());

    }

    /**
     * This method checks if two cities are equal using compareTo
     * @param obj the object to be equated
     * @return
     *      returns true if the cities are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        return this.compareTo((City) obj)==0;
    }
}
