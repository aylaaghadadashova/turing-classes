package lesson11;

public class Car {
    public String model;
    public String color;
    public int wheels;
    public String engineType;
    public float usageYear;
    public float currentSpeed;

    public Car(String model, String color, int wheels, String engineType, float usageYear, float currentSpeed){
        this.model = model;
        this.color = color;
        this. wheels = wheels;
        this.engineType = engineType;
        this.usageYear = usageYear;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String toString() {
        return ("Car = {model: %s\n color: %s\n wheels: %d\n engine type: %s\n usageYear: %.1f\n currentSpeed: %.2f}").formatted(this.model, this.color, this.wheels, this.engineType, this.usageYear, currentSpeed);
    }
}
