package country_city_system;

import java.util.Objects;

public class IndustrialCity extends City{
    private int numberOfFactories;
    private String mainIndustry;
    private double annualProductionVolume;

    public IndustrialCity(){};

    public IndustrialCity(int id, String name, long population, boolean isCapital, double area, Country country, int numberOfFactories, String mainIndustry, double annualProductionVolume) {
        super(id, name, population, isCapital, area, country);
        this.numberOfFactories = numberOfFactories;
        this.mainIndustry = mainIndustry;
        this.annualProductionVolume = annualProductionVolume;
    }

    public int getNumberOfFactories() {
        return numberOfFactories;
    }

    public void setNumberOfFactories(int numberOfFactories) {
        this.numberOfFactories = numberOfFactories;
    }

    public String getMainIndustry() {
        return mainIndustry;
    }

    public void setMainIndustry(String mainIndustry) {
        this.mainIndustry = mainIndustry;
    }

    public double getAnnualProductionVolume() {
        return annualProductionVolume;
    }

    public void setAnnualProductionVolume(double annualProductionVolume) {
        this.annualProductionVolume = annualProductionVolume;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        IndustrialCity that = (IndustrialCity) object;
        return numberOfFactories == that.numberOfFactories && Double.compare(annualProductionVolume, that.annualProductionVolume) == 0 && Objects.equals(mainIndustry, that.mainIndustry);
    }

    public double calculateProductionGrowth(double prevVolume, int years) {
        return ((annualProductionVolume - prevVolume) / prevVolume) * 100 / years;
    }

    @Override
    public double calculateGrowthRate(double previousPop, int years) {
        double baseGrowth = super.calculateGrowthRate(previousPop, years);
        return baseGrowth * 0.9; // 10% lower than normal cities
    }

    @Override
    public String toString() {
        return "City{" +
                "ID: " + this.getId() + "\n" +
                "name: " + this.getName() + "\n" +
                "population: " + this.getPopulation() + "\n" +
                "capital: " + this.isCapital() + "\n" +
                "area=" + this.getArea() + "\n" +
                "country: " + this.getCountry().getName() + "\n" +
                "number of factories: " + numberOfFactories + "\n" +
                "main industry: " + mainIndustry + "\n" +
                "annual production volume: " + annualProductionVolume + "\n" +
                '}';
    }
}
