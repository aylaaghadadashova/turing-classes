package country_city_system;

import java.util.Objects;

public class CapitalCity extends City{
    private String governmentType;
    private int parliamentMembers;
    private String mayorName;

    public CapitalCity(){};

    public CapitalCity(int id, String name, long population, boolean isCapital, double area, Country country, String governmentType, int parliamentMembers, String mayorName) {
        super(id, name, population, isCapital, area, country);
        this.governmentType = governmentType;
        this.mayorName = mayorName;
        this.parliamentMembers = parliamentMembers;
    }

    public String getGovernmentType() {
        return governmentType;
    }

    public void setGovernmentType(String governmentType) {
        this.governmentType = governmentType;
    }

    public int getParliamentMembers() {
        return parliamentMembers;
    }

    public void setParliamentMembers(int parliamentMembers) {
        this.parliamentMembers = parliamentMembers;
    }

    public String getMayorName() {
        return mayorName;
    }

    public void setMayorName(String mayorName) {
        this.mayorName = mayorName;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        CapitalCity that = (CapitalCity) object;
        return parliamentMembers == that.parliamentMembers && Objects.equals(governmentType, that.governmentType) && Objects.equals(mayorName, that.mayorName);
    }

    @Override
    public String toString() {
        return "City{" +
                "ID: " + this.getId() + "\n" +
                "name: " + this.getName() + "\n" +
                "population: " + this.getPopulation() + "\n" +
                "capital: " + this.isCapital() + "\n" +
                "area=" + this.getArea() + "\n" +
                "country: " + this.getCountry() + "\n" +
                "government type: " + governmentType + "\n" +
                "parliament members: " + parliamentMembers + "\n" +
                "mayor name: " + mayorName + "\n" +
                '}';
    }
}
