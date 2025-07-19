package country_city_system;

import java.util.Arrays;
import java.util.Objects;

public class AsianCountry extends Country{
    private double gdpperCapita;
    private boolean hasNucleaarPower;
    private String mainReligion;

    public AsianCountry(int id, String name, String continent, int population, String code, City[] cities, int cityCount, double gdpperCapita, String mainReligion, boolean hasNucleaarPower) {
        super(id, name, continent, population, code, cities, cityCount);
        this.gdpperCapita = gdpperCapita;
        this.mainReligion = mainReligion;
        this.hasNucleaarPower = hasNucleaarPower;
    }

    public double getGdpperCapita() {
        return gdpperCapita;
    }

    public void setGdpperCapita(double gdpperCapita) {
        this.gdpperCapita = gdpperCapita;
    }

    public String getMainReligion() {
        return mainReligion;
    }

    public void setMainReligion(String mainReligion) {
        this.mainReligion = mainReligion;
    }

    public boolean isHasNucleaarPower() {
        return hasNucleaarPower;
    }

    public void setHasNucleaarPower(boolean hasNucleaarPower) {
        this.hasNucleaarPower = hasNucleaarPower;
    }

    @Override
    public boolean equals(Object object){
        if(object == null || getClass() != object.getClass()) return false;
        if(!super.equals(object)) return false;
        AsianCountry that = (AsianCountry) object;
        return gdpperCapita == that.getGdpperCapita() && hasNucleaarPower == that.hasNucleaarPower && Objects.equals(mainReligion, that.mainReligion);
    }

    @Override
    public String toString() {
        return "Country = {" + "\n" +
                "id: " + this.getId() + "\n" +
                "name: " + this.getName() + "\n" +
                "continent: " + this.getContinent() + "\n" +
                "population: " + this.getPopulation() + "\n" +
                "code: " + super.getCode() + "\n" +
                "cities: " + Arrays.toString(this.getCities()) + "\n" +
                "city count: " + this.getCityCount() + "\n" +
                "gdp per capita: " + gdpperCapita + "\n" +
                "nuclear power: " + hasNucleaarPower + "\n" +
                "main religion: " + mainReligion + "\n" +
                '}';
    }
}
