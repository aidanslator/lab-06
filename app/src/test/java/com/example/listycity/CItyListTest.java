package com.example.listycity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CItyListTest {
    public City mockCity(){
        return new City("Edmonton","AB");
    }

    public CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    @Test
    public void testAdd(){
        CityList cityList = mockCityList();
        assertEquals(1,cityList.getCities().size());
        City c = new City("Regina","SK");
        cityList.add(c);
        assertEquals(2,cityList.getCities().size());
        assertTrue(cityList.getCities().contains(c));
    }

    @Test
    public void testGetCities(){
        CityList cityList = mockCityList();
        assertEquals(0,mockCity().compareTo(cityList.getCities().get(0)));
        City c = new City("Charlottetown","PEI");
        cityList.add(c);
        assertEquals(0,c.compareTo(cityList.getCities().get(0)));
        assertEquals(0,mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    public void testAddException(){
        CityList cityList = mockCityList();
        City c = new City("Yellowknife","NWT");
        cityList.add(c);
        assertThrows(IllegalArgumentException.class,()->{cityList.add(c);});
    }

    @Test
    public void testHasCity(){
        CityList cityList = mockCityList();
        City c = new City("Edmonton","AB");
        assertTrue(cityList.hasCity(c));
        assertFalse(cityList.hasCity(new City("Calgary","AB")));
    }

    @Test
    public void testDelete(){
        CityList cityList = mockCityList();
        City c = new City("Edmonton","AB");
        cityList.delete(c);
        assertFalse(cityList.hasCity(c));
    }

    @Test
    public void testDeleteException(){
        CityList cityList = mockCityList();
        assertThrows(IllegalArgumentException.class,()->{cityList.delete(new City("Calgary","AB"));});

    }

    @Test
    public void testCountCities(){
        CityList cityList = mockCityList();
        City c = new City("Calgary","AB");
        cityList.add(c);
        assertEquals(2,cityList.countCities());
    }

}


