package lesson11;

public class Motoskilet{

    public String color;
    public String model;
    public String name;
    public String wheel;


    public Motoskilet(String name, String color, String model, String wheel) {
        this.color = color;
        this.model = model;
        this.name = name;
        this.wheel = wheel;
    }

    public String toString() {
        return ("Motoskilet = color:%s\n  model:%s\n name:%s\n wheel:%s\n  ").formatted(this.color, this.model, this.name, this.wheel);
    }
}