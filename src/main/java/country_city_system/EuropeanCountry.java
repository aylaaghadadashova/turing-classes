package country_city_system;

import java.util.Arrays;
import java.util.Objects;

public class EuropeanCountry extends Country{
    private boolean isInEuropeanUnion;
    private String mainExport;
    private int foundingYear;

    public EuropeanCountry(int id, String name, String continent, long population, String code, City[] cities, int cityCount, boolean isInEuropeanUnion, String mainExport, int foundingYear) {
        super(id, name, continent, population, code, cities, cityCount);
        this.isInEuropeanUnion = isInEuropeanUnion;
        this.mainExport = mainExport;
        this.foundingYear = foundingYear;
    }

    public boolean isInEuropeanUnion() {
        return isInEuropeanUnion;
    }

    public void setInEuropeanUnion(boolean inEuropeanUnion) {
        isInEuropeanUnion = inEuropeanUnion;
    }

    public String getMainExport() {
        return mainExport;
    }

    public void setMainExport(String mainExport) {
        this.mainExport = mainExport;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    @Override
    public boolean equals(Object object){
        if (object == null || getClass() != object.getClass()) return false;
        if(!super.equals(object)) return false;
        EuropeanCountry that = (EuropeanCountry) object;
        return isInEuropeanUnion == that.isInEuropeanUnion && Objects.equals(mainExport, that.mainExport) && foundingYear == foundingYear;
    }

    @Override
    public String toString() {
        return "Country = {" + "\n" +
                "id: " + this.getId() + "\n" +
                "name: " + this.getName() + "\n" +
                "continent: " + this.getContinent() + "\n" +
                "population: " + this.getPopulation() + "\n" +
                "code: " + super.getCode() + "\n" +
                "city count: " + this.getCityCount() + "\n" +
                "cities: " + Arrays.toString(this.getCities()) + "\n" +
                "is in European Union: " + isInEuropeanUnion + "\n" +
                "main export: " + mainExport + "\n" +
                "founding year: " + foundingYear + "\n" +
                '}';
    }
}
