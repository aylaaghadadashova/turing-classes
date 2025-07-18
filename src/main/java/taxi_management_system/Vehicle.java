package taxi_management_system;

public class Vehicle {
    private String brand;
    private String model;
    private String plateNumber;
    private boolean isAvailable;

    public Vehicle(String brand, String model, String plateNUmber, boolean isAvailable){
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNUmber;
        this.isAvailable = isAvailable;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String mode){
        this.model = model;
    }

    public String getPlateNumber(){
        return this.plateNumber;
    }

    public void setPlateNumber(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public boolean getAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void drive(){
        System.out.println("Vehicle is moving");
    }

    public String vehicleInfo(){
        return "Vehicle = {\n" +
                "brand: " + this.brand + "\n" +
                "model: " + this.model + "\n" +
                "plate number: " + this.plateNumber + "\n" +
                "availability: " + this.isAvailable + "\n" +
                "}";
    }
}
