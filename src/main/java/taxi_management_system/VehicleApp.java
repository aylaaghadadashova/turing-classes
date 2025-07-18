package taxi_management_system;

public class VehicleApp {

    public static void main(String[] args) {

        Vehicle v1 = new Taxi("Toyota", "Prius", "90-SD-123", true, 3, "BakuTaxi");
        Vehicle v2 = new Bus("Mercedes", "Sprinter", "10-ZC-406", true, 20, false);

        v1.drive();
        v2.drive();

        if(v1 instanceof  Taxi){
            Taxi t = (Taxi) v1;
            t.calculateFare(10);
        }

        Driver driver = new Driver("Ali Ahmadov", 35, "AZ123456");
        driver.setAge(36);
        System.out.println(driver.getLicenseNumber());

        System.out.println();
        System.out.println(driver);
        System.out.println();
        System.out.println(v1.vehicleInfo());
        System.out.println(v2.vehicleInfo());
    }
}
