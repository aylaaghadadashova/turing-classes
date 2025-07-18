package taxi_management_system;

public class Bus extends Vehicle{
    private int capacity;
    private boolean isDoubleDecker;

    public Bus(String brand, String model, String plateNumber, boolean isAvailable, int capacity, boolean isDoubleDecker){
        super(brand, model, plateNumber, isAvailable);
        this.capacity = capacity;
        this.isDoubleDecker = isDoubleDecker;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public boolean getDoubleDecker(){
        return isDoubleDecker;
    }

    public void  setDoubleDecker(boolean doubleDecker){
        this.isDoubleDecker = isDoubleDecker;
    }

    @Override
    public void drive(){
        System.out.printf("Bus with capacity %d is moving.\n", capacity);
    }

    @Override
    public String vehicleInfo(){
        return "Bus = {\n" +
                "brand: " + this.getBrand() + "\n" +
                "model: " + this.getModel() + "\n" +
                "plate number: " + this.getPlateNumber() + "\n" +
                "availability: " + this.getAvailable() + "\n" +
                "capacity: " + this.capacity + "\n" +
                "double decker: " + this.isDoubleDecker + "\n" +
                "}";
    }
}
