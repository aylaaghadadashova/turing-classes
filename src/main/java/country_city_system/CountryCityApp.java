package country_city_system;

import javax.sound.midi.Soundbank;
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

    public static int indexOfCountry(int id){//Ayla
        for(int i = 0; i<countryCount; i++){
            if(id == countries[i].getId()) return i;
        }
        return -1;
    }

    public static int indexOfCity(String cityName){//Ayla
        for(int i = 0; i<cityCount; i++){
            if(cityName.equals(cities[i].getName())) return i;
        }
        return -1;
    }

    public static int indexOfCity(int id){//Ayla
        for(int i = 0; i<cityCount; i++){
            if(id == cities[i].getId()) return i;
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

        int cityIndex = indexOfCity(id);
        if (cityIndex == -1) {
            System.out.println("City not found!");
            return;
        }

        String cityName = cities[cityIndex].getName();

        cities[cityIndex].getCountry().removeCity(id); //removing from inner array
        for(int i = cityIndex; i<cityCount; i++){
            cities[i] = cities[i++];
        }
        cityCount--;
        System.out.println("City '" + cityName + "' removed successfully!");
    }

    public static void removeCountry(){
        System.out.println("\n--- REMOVE COUNTRY ---\n");

        if(countryCount == 0) {
            System.out.println("No country available to remove!");
            return;
        }

        System.out.print("Enter ID of the country: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        int countryIndex = indexOfCountry(id);
        if (countryIndex == -1) {
            System.out.println("Country not found!");
            return;
        }

        String countryName = countries[countryIndex].getName();

        // Remove country from array
        for(int i = countryIndex; i < countryCount - 1; i++) {
            countries[i] = countries[i + 1];
        }
        countryCount--;

        // Remove all cities belonging to this country
        int newCityCount = 0;
        for(int i = 0; i < cityCount; i++) {
            if(cities[i].getCountry() == null || cities[i].getCountry().getId() != id) {
                cities[newCityCount++] = cities[i];
            }
        }
        cityCount = newCityCount;

        System.out.println("Country '" + countryName + "' and all its cities removed successfully!");
    }

    public static void updateCity() {
        System.out.println("\n---UPDATE CITY---\n");

        if (cityCount == 0) {
            System.out.println("No cities to update!");
            return;
        }

        System.out.print("Enter name of city to update: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        int index = indexOfCity(name);
        if (index == -1){
            System.out.println("City not found!");
            return;
        }

        City city = cities[index];

        System.out.println("\nUpdate the fields:");

        System.out.print("Name (" + city.getName() + "): ");
        city.setName(scanner.nextLine());

        System.out.print("Population (" + city.getPopulation() + "): ");
        city.setPopulation(scanner.nextLong());

        System.out.print("Is capital (" + city.isCapital() + "): ");
        city.setCapital(scanner.nextBoolean());

        System.out.print("Area (" + city.getArea() + "): ");
        city.setArea(scanner.nextDouble());
        scanner.nextLine();

        if (city instanceof CapitalCity) {
            CapitalCity capital = (CapitalCity) city;

            System.out.print("Government type (" + capital.getGovernmentType() + "): ");
            capital.setGovernmentType(scanner.nextLine());

            System.out.print("Parliament members (" + capital.getParliamentMembers() + "): ");
            capital.setParliamentMembers(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Mayor name (" + capital.getMayorName() + "): ");
            capital.setMayorName(scanner.nextLine());
        } else if (city instanceof TouristCity) {
            TouristCity tourist = (TouristCity) city;

            System.out.print("Annual visitors (" + tourist.getAnnualVisitors() + "): ");
            tourist.setAnnualVisitors(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Main attraction (" + tourist.getMainAttraction() + "): ");
            tourist.setMainAttraction(scanner.nextLine());

            System.out.print("Annual tourism revenue (" + tourist.getAnnualTourismRevenue() + "): ");
            tourist.setAnnualTourismRevenue(scanner.nextDouble());
            scanner.nextLine();
        } else if (city instanceof IndustrialCity) {
            IndustrialCity industrial = (IndustrialCity) city;

            System.out.print("Number of factories (" + industrial.getNumberOfFactories() + "): ");
            industrial.setNumberOfFactories(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Main industry (" + industrial.getMainIndustry() + "): ");
            industrial.setMainIndustry(scanner.nextLine());

            System.out.print("Annual production volume (" + industrial.getAnnualProductionVolume() + "): ");
            industrial.setAnnualProductionVolume(scanner.nextDouble());
            scanner.nextLine();
        }
        //updating in inner arr of the country
        Country country = city.getCountry();
        if (country != null) {
            City[] countryCities = country.getCities();
            for (int i = 0; i < country.getCityCount(); i++) {
                if (countryCities[i].getName().equals(name)) {
                    countryCities[i] = city;
                    break;
                }
            }
        }

        System.out.println("City updated successfully!");
    }

    public static void updateCountry(){
        System.out.println("\n--- UPDATE COUNTRY ---\n");

        if(countryCount == 0){
            System.out.println("No country to update!");
            return;
        }

        System.out.println("Enter country id to update: ");
        int id = scanner.nextInt();

        int countryIndex = indexOfCountry(id);
        if(countryIndex == -1){
            System.out.println("Country not found!");
        }

        Country country = countries[countryIndex];

        System.out.println("Enter fields to update");

        System.out.print("Name (" + country.getName() + "): ");
        scanner.nextLine();
        country.setName(scanner.nextLine());

        System.out.println("Populations (" + country.getPopulation() + "): ");
        country.setPopulation(scanner.nextLong());

        System.out.println(("Code (" + country.getCode() + "): "));
        scanner.nextInt();
        country.setCode(scanner.nextLine());

        if(country instanceof AfricanCountry){
            AfricanCountry african = (AfricanCountry) country;

            System.out.println("Main language (" + african.getMainLanguage() + "): ");
            scanner.nextLine();
            african.setMainLanguage(scanner.nextLine());

            System.out.println("Is developing: (" + african.isDeveloping() + "): ");
            african.setDeveloping(scanner.nextBoolean());

            System.out.println("Currency (" + african.getCurrency() + "): ");
            scanner.nextLine();
            african.setCurrency(scanner.nextLine());
        } else if(country instanceof AsianCountry){
            AsianCountry asian = (AsianCountry) country;

            System.out.println("GDP per capita (" + asian.getGdpperCapita() + "): ");
            asian.setGdpperCapita(scanner.nextDouble());

            System.out.println("Has nuclear power: (" + asian.isHasNucleaarPower() + "): ");
            asian.setHasNucleaarPower(scanner.nextBoolean());

            System.out.println("Main religion (" + asian.getMainReligion() + "): ");
            scanner.nextLine();
            asian.setMainReligion(scanner.nextLine());
        } else if(country instanceof EuropeanCountry){
            EuropeanCountry european = (EuropeanCountry) country;

            System.out.println("Is in European Union (" + european.isInEuropeanUnion() + "): ");
            european.setInEuropeanUnion(scanner.nextBoolean());

            System.out.println("Main export: (" + european.getMainExport() + "): ");
            scanner.nextLine();
            european.setMainExport(scanner.nextLine());

            System.out.println("Founding year (" + european.getFoundingYear() + "): ");
            european.setFoundingYear(scanner.nextInt());
        }

        System.out.println("Country successfully updated!");
    }

    public static void displayAll(){
        System.out.println("\n--- FULL LIST OF COUNTRIES AND CITIES ---\n");
        if (countryCount == 0) {
            System.out.println("No countries added yet.");
            return;
        }

        for (int i = 0; i < countryCount; i++){
            System.out.println(countries[i]);
        }
    }

    public static void showRates(){
        System.out.println("\n--- GROWTH RATE CALCULATIONS ---\n");
        System.out.println("1. City population growth");
        System.out.println("2. Tourism revenue growth");
        System.out.println("3. Industrial production growth");
        System.out.print("\nSelect calculation type: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

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

            if (includeMigration.equals("yes")) {
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
