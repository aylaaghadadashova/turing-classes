package lesson11;

public class MotoCarApp {

    public static void main(String[] args) {

        Car car = new Car("Honda", "yellow", 4, "hybrid", 2, 0);
        System.out.println(car.toString());
        System.out.println();
        Motoskilet motoskilet = new Motoskilet("R1M", "Red", "CBR650R", "2");
        System.out.println(motoskilet.toString());
    }
}
