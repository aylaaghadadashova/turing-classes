package country_city_system;

import java.util.Objects;

public class TouristCity extends City{
    private int annualVisitors;
    private String mainAttraction;
    private double annualTourismRevenue;

    public TouristCity(){};

    public TouristCity(int id, String name, long population, boolean isCapital, double area, Country country, int annualVisitors, String mainAttraction, double annualTourismRevenue) {
        super(id, name, population, isCapital, area, country);
        this.annualVisitors = annualVisitors;
        this.mainAttraction = mainAttraction;
        this.annualTourismRevenue = annualTourismRevenue;
    }

    public int getAnnualVisitors() {
        return annualVisitors;
    }

    public void setAnnualVisitors(int annualVisitors) {
        this.annualVisitors = annualVisitors;
    }

    public String getMainAttraction() {
        return mainAttraction;
    }

    public void setMainAttraction(String mainAttraction) {
        this.mainAttraction = mainAttraction;
    }

    public double getAnnualTourismRevenue() {
        return annualTourismRevenue;
    }

    public void setAnnualTourismRevenue(double annualTourismRevenue) {
        this.annualTourismRevenue = annualTourismRevenue;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        TouristCity that = (TouristCity) object;
        return annualVisitors == that.annualVisitors && Double.compare(annualTourismRevenue, that.annualTourismRevenue) == 0 && Objects.equals(mainAttraction, that.mainAttraction);
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
                "annaul visitors: " +annualVisitors + "\n" +
                "main attraction: " + mainAttraction + "\n" +
                "annual toursim revenue: " + annualTourismRevenue + "\n" +
                '}';
    }
}
