package country_city_system;

import java.util.Arrays;
import java.util.Objects;

public class AfricanCountry extends Country{
    private String mainLanguage;
    private boolean isDeveloping;
    private String currency;

    public AfricanCountry(int id, String name, String continent, long population, String code, City[] cities, int cityCount, String mainLanguage, boolean isDeveloping, String currency) {
        super(id, name, continent, population, code, cities, cityCount);
        this.mainLanguage = mainLanguage;
        this.isDeveloping = isDeveloping;
        this.currency = currency;
    }

    public boolean isDeveloping() {
        return isDeveloping;
    }

    public void setDeveloping(boolean developing) {
        isDeveloping = developing;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        AfricanCountry that = (AfricanCountry) object;
        return isDeveloping == that.isDeveloping && Objects.equals(mainLanguage, that.mainLanguage) && Objects.equals(currency, that.currency);
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
                "main language: " + mainLanguage + "\n" +
                "developing: " + isDeveloping + "\n" +
                "currency: " + currency + "\n" +
                '}';
    }
}
