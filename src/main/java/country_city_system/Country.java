package country_city_system;

import java.util.Arrays;
import java.util.Objects;

public class Country {
    private int id;
    private String name;
    private String continent;
    private int population;
    private String code;
    private City[] cities;
    private int cityCount;

    public Country(int id, String name, String continent, int population, String code, City[] cities, int cityCount) {
        this.id = id;
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.code = code;
        this.cities = cities;
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

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
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

    @Override
    public String toString() {
        return "Country = {" + "\n" +
                "id: " + id + "\n" +
                "name: " + name + "\n" +
                "continent: " + continent + "\n" +
                "population: " + population + "\n" +
                "code: " + code + "\n" +
                "cities: " + Arrays.toString(cities) + "\n" +
                "city count: " + cityCount +
                '}';
    }
}

