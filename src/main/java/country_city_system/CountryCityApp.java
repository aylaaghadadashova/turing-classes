package country_city_system;

import java.util.Scanner;

public class CountryCityApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[100];
        City[] cities = new City[500];
        int countryCount = 0;
        int cityCount = 0;

        while (true){
        showMenu();
        System.out.print("Enter your option: ");
        int option = scanner.nextInt();

        switch (option){
            case 1: addCity(cities, scanner); break;
            case 2: addCountry();break;
            case 3: removeCity(); break;
            case 4: removeCountry(); break;
            case 5: updateCity(); break;
            case 6: updateCountry(); break;
            case 7: displayAll(); break;
            case 8: showRates(); break;
            case 9: System.exit(0);
            default:
                System.out.println("Wrong input! Try again.");
        }

    }
    }

    public static void showMenu(){
        System.out.println("---MENU---\n" +
                "1. Add City \n" +
                "2. Add Country \n" +
                "3. Remove City \n" +
                "4. Remove Country \n" +
                "5. Update City \n" +
                "6. Update Country \n" +
                "7. Display Full List of Countries and Cities \n" +
                "8. Calculate Growth Rate \n" +
                "9. Exit");
    }

    public static void addCity(City[] cities, Scanner scanner){
        System.out.print("\n---ADD CITY---\n1. Capital City \n2.Tourist City \n3. Industrial City\n\nEnter type of city: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the fields: ");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("Continent: ");
        String continent = scanner.nextLine();
        System.out.println("Population");
    }

    public static void addCountry(){};

    public static void removeCity(){};

    public static void removeCountry(){};

    public static void updateCity(){};

    public static void updateCountry(){};

    public static void displayAll(){};

    public static void showRates(){};
}
