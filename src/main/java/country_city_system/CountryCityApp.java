package country_city_system;

import java.util.Scanner;

public class CountryCityApp {

    public static void main(String[] args) {

        Country[] countries = new Country[100];
        City[] cities = new City[500];

        int countryCount = 0;
        int cityCount = 0;

        Scanner scanner = new Scanner(System.in);
        showMenu();
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
                "8. Calculate Growth Rate");
    }

    public static void addCity(City[] cities, Scanner scanner){
        System.out.println("Enter type of city: \n1. Capital City \n2.Tourist City \n3. Industrial City");
        int choice = scanner.nextInt();
        System.out.println("Enter the fields: ");
        if(choice == 1){
            CapitalCity newCity = new CapitalCity();

        }
    }
}
