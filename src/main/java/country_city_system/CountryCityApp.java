package country_city_system;

import java.sql.SQLOutput;
import java.util.Arrays;
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
            System.out.print("\n--- ADD CITY ---\n1. Capital City \n2.Tourist City \n3. Industrial City\n\nEnter type of city: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice > 0 && choice <= 3) break;
            else System.out.println("Wrong input! Try again.");
        }

        System.out.println("\nEnter the fields: ");
        System.out.print("Country: ");
        String country = scanner.nextLine();
        int index = indexOfCountry(country);
        if (index == -1) {
            System.out.println("Country not found!");
            return;
        }

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
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
            System.out.print("Parliament members: ");
            int parliamentMembers = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Mayor name: ");
            String mayorName = scanner.nextLine();

            CapitalCity capitalCity = new CapitalCity(id, name, population, isCapital, area, countries[index], governmentType, parliamentMembers, mayorName);
            cities[cityCount++] = capitalCity;
            countries[index].addCity(capitalCity);
        } else if(choice == 2){
            System.out.print("Annual visitors: ");
            int annualVisitors = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Main attraction: ");
            String mainAttraction = scanner.nextLine();
            System.out.print("Annual tourism revenue: ");
            double annualTourismRevenue = scanner.nextDouble();
            scanner.nextLine();

            TouristCity touristCity = new TouristCity(id, name, population, isCapital, area, countries[index], annualVisitors, mainAttraction, annualTourismRevenue);
            cities[cityCount++] = touristCity;
            countries[index].addCity(touristCity);
        } else if(choice == 3){
            System.out.print("Number of factories: ");
            int numberOfFactories = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Main industry: ");
            String mainIndustry = scanner.nextLine();
            System.out.print("Annual production volume: ");
            double annualProductionVolume = scanner.nextDouble();
            scanner.nextLine();

            IndustrialCity industrialCity = new IndustrialCity(id, name, population, isCapital, area, countries[index], numberOfFactories, mainIndustry, annualProductionVolume);
            cities[cityCount++] = industrialCity;
            countries[index].addCity(industrialCity);
        }
        System.out.println("City '" + name + "' added successfully!");
    }

    public static void addCountry(){
        int choice;
        while(true) {
            System.out.print("\n--- ADD COUNTRY ---\n1. African Country \n2. Asian Country \n3. European Country\n\nEnter type of country: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice > 0 && choice <= 3) break;
            else System.out.println("Wrong input! Try again.");
        }

        System.out.println("\nEnter the fields: ");
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
            scanner.nextLine();
            System.out.print("Currency: ");
            String currency = scanner.nextLine();

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
        System.out.println("Country '" + name + "' added successfully!");
    };

    public static void removeCity(){
        System.out.println("\n--- REMOVE CITY ---\n");
        if (cityCount == 0) {
            System.out.println("No cities available to remove!");
            return;
        }

        System.out.print("Enter ID of the city: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name of the city: ");
        String name = scanner.nextLine();

        int cityIndex = indexOfCity(name);
        if (cityIndex == -1) {
            System.out.println("City not found!");
            return;
        }

        cities[cityIndex].getCountry().removeCity(id); //removing from inner array
        City[] tempArr = new City[cityCount - 1];
        int index = 0;
        for(int i = 0; i < cityCount ; i++){
            if(cities[i].getId() == id) continue;
            tempArr[index++] = cities[i];
        }
        cities = tempArr;
        cityCount--;
        System.out.println("City '" + name + "' removed successfully!");
    };

    public static void removeCountry(){
        System.out.println("\n--- REMOVE COUNTRY ---\n");

        if(countryCount == 0) {
            System.out.println("No country available to remove!");
            return;
        }

        System.out.print("Enter ID of the country: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name of the country: ");
        String name = scanner.nextLine();

        int countryIndex = indexOfCountry(name);
        if (countryIndex == -1) {
            System.out.println("Country not found!");
            return;
        }

        Country[] tempArr = new Country[countryCount - 1];
        int index1 = 0;
        for(int i = 0; i < countryCount ; i++){
            if(countries[i].getId() == id) continue;
            tempArr[index1++] = countries[i];
        }
        countries = tempArr;
        countryCount--;

        //Removing cities of the country
        City[] tempArr2 = new City[cityCount-1];
        int index2 = 0;
        for (int i = 0; i < cityCount; i++){
            if (cities[i].getCountry().getId() == id) {
                cityCount--;
                continue;
            }
            tempArr2[index2++] = cities[i];
        }
        cities = Arrays.copyOf(tempArr2, cityCount);
        System.out.println("Country '" + name + "' removed successfully!");
    }

    public static void updateCity() {
        System.out.println("\n---UPDATE CITY---\n");

        System.out.print("Enter name of city: ");
        String name = scanner.nextLine();
        int index = indexOfCity(name);
        if (index == -1){
            System.out.println("City not found!");
            return;
        }
        City city = cities[index];

        System.out.println("\nUpdate the fields: ");

        System.out.print("Population: ");
        long population = scanner.nextLong();
        System.out.print("Is capital: ");
        boolean isCapital = scanner.nextBoolean();
        System.out.print("Area: ");
        double area = scanner.nextDouble();
        if (city instanceof CapitalCity) {
            System.out.print("Government type: ");
            String governmentType = scanner.nextLine();
            System.out.print("Parliament members: ");
            int parliamentMembers = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Mayor name: ");
            String mayorName = scanner.nextLine();

            city = new CapitalCity(cities[index].getId(), name, population, isCapital, area, city.getCountry(), governmentType, parliamentMembers, mayorName);
        } else if (city instanceof TouristCity) {
            System.out.print("Annual visitors: ");
            int annualVisitors = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Main attraction: ");
            String mainAttraction = scanner.nextLine();
            System.out.print("Annual tourism revenue: ");
            double annualTourismRevenue = scanner.nextDouble();
            scanner.nextLine();

            TouristCity touristCity = new TouristCity(cities[index].getId(), name, population, isCapital, area, countries[index], annualVisitors, mainAttraction, annualTourismRevenue);
        } else if (city instanceof IndustrialCity) {
            System.out.print("Number of factories: ");
            int numberOfFactories = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Main industry: ");
            String mainIndustry = scanner.nextLine();
            System.out.print("Annual production volume: ");
            double annualProductionVolume = scanner.nextDouble();
            scanner.nextLine();

            IndustrialCity industrialCity = new IndustrialCity(cities[index].getId(), name, population, isCapital, area, countries[index], numberOfFactories, mainIndustry, annualProductionVolume);
        }
        //updating in inner arr of the country
        int countryIndex = indexOfCountry(city.getCountry().getName());
        countries[countryIndex].getCities()[indexOfCity(name)] = city;
    }

    public static void updateCountry(){};

    public static void displayAll(){
        System.out.println("\n--- FULL LIST OF COUNTRIES AND CITIES ---\n");
        if (countryCount == 0) {
            System.out.println("No countries added yet.");
            return;
        }

        for (int i = 0; i < countryCount; i++){
            System.out.println(countries[i]);
        }
    };

    public static void showRates(){
        System.out.println("\n--- GROWTH RATE CALCULATIONS ---\n");
        System.out.println("1. City population growth");
        System.out.println("2. Tourism revenue growth");
        System.out.println("3. Industrial production growth");
        System.out.print("\nSelect calculation type: ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            System.out.print("Enter city name: ");
            scanner.nextLine();
            String cityName = scanner.nextLine();

            int index = indexOfCity(cityName);
            if (index == -1) {
                System.out.println("City not found!");
                return;
            }
            System.out.print("Enter previous population: ");
            double prevPop = scanner.nextDouble();
            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            System.out.print("Include migration effect? (yes/no): ");
            String includeMigration = scanner.nextLine();
            City city = cities[index];
            double growthRate;

            if (includeMigration == "yes") {
                System.out.print("Enter total migration effect (%): ");
                double migration = scanner.nextDouble();
                growthRate = city.calculateGrowthRate(prevPop, years, migration);
            } else {
                growthRate = city.calculateGrowthRate(prevPop, years);
            }

            System.out.printf("%s population growth rate: %.2f%% per year\n",
                    cityName, growthRate);
        } else if (choice == 2) {
            System.out.print("Enter tourist city name: ");
            scanner.nextLine();
            String cityName = scanner.nextLine();

            int index = indexOfCity(cityName);
            if (index == -1 || !(cities[index] instanceof TouristCity)) {
                System.out.println("Tourist city not found!");
                return;
            }

            System.out.print("Enter previous tourism revenue: ");
            double prevRevenue = scanner.nextDouble();
            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            TouristCity city = (TouristCity) cities[index];
            double growthRate = city.calculateTourismGrowth(prevRevenue, years);

            System.out.printf("%s tourism revenue growth: %.2f%% per year\n",
                    cityName, growthRate);
        } else if(choice == 3) {
            System.out.print("Enter industrial city name: ");
            scanner.nextLine();
            String cityName = scanner.nextLine();

            int index = indexOfCity(cityName);
            if (index == -1 || !(cities[index] instanceof IndustrialCity)) {
                System.out.println("Industrial city not found!");
                return;
            }

            System.out.print("Enter previous production volume: ");
            double prevVolume = scanner.nextDouble();
            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            IndustrialCity city = (IndustrialCity) cities[index];
            double growthRate = city.calculateProductionGrowth(prevVolume, years);

            System.out.printf("%s production growth: %.2f%% per year\n",
                    cityName, growthRate);
        } else System.out.println("Wrong input!"); return;
        }
}
