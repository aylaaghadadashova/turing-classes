package country_city_system;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountryCityApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Country[] countries = new Country[100];
    private static City[] cities = new City[500];
    private static int countryCount = 0;
    private static int cityCount = 0;

    public static void main(String[] args) {

        while (true){
        showMenu();
        System.out.print("\nEnter your option: ");
        int option = scanner.nextInt();

        switch (option){
            case 1: addCity(); break;
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
        System.out.println("\n---MENU---\n" +
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

    public static int indexOfCountry(String countryName){//Ayla
        for(int i = 0; i<countryCount; i++){
            if(countryName.equals(countries[i].getName())) return i;
        }
        return -1;
    }

    public static int indexOfCity(String cityName){//Ayla
        for(int i = 0; i<cityCount; i++){
            if(cityName.equals(cities[i].getName())) return i;
        }
        return -1;
    }

    public static void addCity(){
        int choice;
        while(true) {
            System.out.print("\n---ADD CITY---\n1. Capital City \n2.Tourist City \n3. Industrial City\n\nEnter type of city: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice > 0 && choice <= 3) break;
            else System.out.println("Wrong input! Try again.");
        }

        System.out.println("\nEnter the fields: \n");
        System.out.print("Country: ");
        String country = scanner.nextLine();
        int index = indexOfCountry(country);
        if (index == -1) {
            System.out.println("Country is not found!");
            return;
        }

        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Population: ");
        long population = scanner.nextLong();
        System.out.print("Is capital: ");
        boolean isCapital = scanner.nextBoolean();
        System.out.print("Area: ");
        double area = scanner.nextDouble();
        if(choice == 1) {
            System.out.print("Government type: ");
            String governmentType = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Parliament members: ");
            int parliamentMembers = scanner.nextInt();
            System.out.print("Mayor name: ");
            String mayorName = scanner.nextLine();
            scanner.nextLine();

            CapitalCity capitalCity = new CapitalCity(id, name, population, isCapital, area, countries[index], governmentType, parliamentMembers, mayorName);
            cities[cityCount++] = capitalCity;
            countries[index].addCity(capitalCity);
        } else if(choice == 2){
            System.out.print("Annual visitors: ");
            int annualVisitors = scanner.nextInt();
            System.out.print("Main attraction: ");
            String mainAttraction = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Annual tourism revenue: ");
            double annualTourismRevenue = scanner.nextDouble();

            TouristCity touristCity = new TouristCity(id, name, population, isCapital, area, countries[index], annualVisitors, mainAttraction, annualTourismRevenue);
            cities[cityCount++] = touristCity;
            countries[index].addCity(touristCity);
        } else if(choice == 3){
            System.out.print("Number of factories: ");
            int numberOfFactories = scanner.nextInt();
            System.out.print("Main industry: ");
            String mainIndustry = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Annual production volume: ");
            double annualProductionVolume = scanner.nextDouble();

            IndustrialCity industrialCity = new IndustrialCity(id, name, population, isCapital, area, countries[index], numberOfFactories, mainIndustry, annualProductionVolume);
            cities[cityCount++] = industrialCity;
            countries[index].addCity(industrialCity);
        }
    }

    public static void addCountry(){
        int choice;
        while(true) {
            System.out.print("\n---ADD COUNTRY---\n1. African Country \n2. Asian Country \n3. European Country\n\nEnter type of country: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice > 0 && choice <= 3) break;
            else System.out.println("Wrong input! Try again.");
        }

        System.out.println("\nEnter the fields: \n");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Continent: ");
        String continent = scanner.nextLine();
        System.out.print("Population: ");
        long population = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Code: ");
        String code = scanner.nextLine();
        int cityCount = 0;
        City[] innerCities = new City[cityCount];
        if(choice == 1) {
            System.out.print("Main language: ");
            String mainLanguage = scanner.nextLine();
            System.out.print("Is developing: ");
            boolean isDeveloping = scanner.nextBoolean();
            System.out.print("Currency: ");
            String currency = scanner.nextLine();
            scanner.nextLine();

            AfricanCountry africanCountry = new AfricanCountry(id, name,  continent, population, code, innerCities, cityCount, mainLanguage, isDeveloping, currency);
            countries[countryCount++] = africanCountry;
        } else if(choice == 2){
            System.out.print("GDP per capita: ");
            double gdpPerCapita = scanner.nextDouble();
            System.out.print("Has nuclear power: ");
            boolean hasNuclearPower = scanner.nextBoolean();
            System.out.print("Main religion: ");
            String mainReligion = scanner.nextLine();
            scanner.nextLine();

            AsianCountry asianCountry = new AsianCountry(id, name, continent, population, code, innerCities, cityCount, gdpPerCapita, hasNuclearPower, mainReligion);
            countries[countryCount++] = asianCountry;
        } else if(choice == 3){
            System.out.print("Is in European Union: ");
            boolean isInEuropeanUnion = scanner.nextBoolean();
            System.out.print("Main export: ");
            String mainExport = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Founding year: ");
            int foundingYear = scanner.nextInt();

            EuropeanCountry europeanCountry = new EuropeanCountry(id, name, continent, population, code, innerCities, cityCount, isInEuropeanUnion, mainExport, foundingYear);
            countries[countryCount++] = europeanCountry;
        }
    };

    public static void removeCity(){};

    public static void removeCountry(){};

    public static void updateCity(){};

    public static void updateCountry(){};

    public static void displayAll(){
        for (int i = 0; i < countryCount; i++){
            System.out.println(countries[i]);
        }
    };

    public static void showRates(){};
}
