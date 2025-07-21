package country_city_system;

import java.util.Arrays;
import java.util.Objects;

public class Country {
    private int id;
    private String name;
    private String continent;
    private long population;
    private String code;
    private City[] cities;
    private int cityCount;

    //test constructor
    public Country(String name){
        this.name = name;
    }

    public Country(int id, String name, String continent, long population, String code, City[] cities, int cityCount) {
        this.id = id;
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.code = code;
        this.cities = cities != null ? cities : new City[0];
        this.cityCount = cityCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public int getCityCount() {
        return cityCount;
    }

    public void setCityCount(int cityCount) {
        this.cityCount = cityCount;
    }

    @Override
    public boolean equals(Object object){
        if(object == null || getClass() != object.getClass()) return false;
        Country country = (Country) object;
        return id == country.id && population == country.population && cityCount == country.cityCount && Objects.equals(name, country.name) && Objects.equals(continent, country.continent) && Objects.equals(code, country.code) && Objects.deepEquals(cities, country.cities);
    }

    public void addCity(City city){
        City[] tempArr = new City[cityCount + 1];
        for(int i = 0; i < cityCount ; i++){
            tempArr[i] = cities[i];
        }
        tempArr[cityCount] = city;
        cities = tempArr;
        cityCount++;
    }

    public void removeCity(int id){
        City[] tempArr = new City[cityCount - 1];
        int index = 0;
        for(int i = 0; i < cityCount ; i++){
            if(cities[i].getId() == id) continue;
            tempArr[index++] = cities[i];
        }
        cities = tempArr;
        cityCount--;
    }

    public int indexOfCity(String cityName){//Ayla
        for(int i = 0; i<cityCount; i++){
            if(cityName.equals(cities[i].getName())) return i;
        }
        return -1;
    }


    @Override
    public String toString() {
        return "Country = {" + "\n" +
                "id: " + id + "\n" +
                "name: " + name + "\n" +
                "continent: " + continent + "\n" +
                "population: " + population + "\n" +
                "code: " + code + "\n" +
                "city count: " + cityCount + "\n" +
                "cities: " + Arrays.toString(cities)  +
                '}';
    }
}

