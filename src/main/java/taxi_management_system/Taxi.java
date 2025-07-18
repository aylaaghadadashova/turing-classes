package taxi_management_system;

import java.sql.SQLOutput;

public class Taxi extends Vehicle{
    private int passengerCount;
    private String taxiCompany;

    public Taxi(String brand, String model, String plateNumber, boolean isAvailable, int passengerCount, String taxiCompany){
        super(brand, model, plateNumber, isAvailable);
        this.passengerCount = passengerCount;
        this.taxiCompany = taxiCompany;
    }

    public int getPassengerCount(){
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount){
        this.passengerCount = passengerCount;
    }

    public String getTaxiCompany(){
        return taxiCompany;
    }

    public void setTaxiCompany(String taxiCompany){
        this.taxiCompany = taxiCompany;
    }

    @Override
    public void drive(){
        System.out.printf("Taxi from %s is driving with %d passengers\n", taxiCompany, passengerCount);
    }

    public void calculateFare(int km){
        float baseRate = 0.75f;
        System.out.println(km * baseRate);
    };

    public void calculateFare(int km, boolean nightShift){
        float baseRate = 0.75f;
        float nightRateMultiplier = 1.5f;

        System.out.println(km * baseRate * (nightShift ? nightRateMultiplier : 1));
    };

    @Override
    public String vehicleInfo(){
        return "Taxi = {\n" +
                "brand: " + this.getBrand() + "\n" +
                "model: " + this.getModel() + "\n" +
                "plate number: " + this.getPlateNumber() + "\n" +
                "availability: " + this.getAvailable() + "\n" +
                "passenger count: " + this.passengerCount + "\n" +
                "taxi company: " + this.taxiCompany;
    }
}
