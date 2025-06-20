package lesson3;

import java.util.Scanner;

public class ProductSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Product list:\n" +
                "1: \"Chocolate Bar - $2.00\" \n" +
                "2: \"Soda - $1.50\"\n" +
                "3: \"Chips - $1.20\" \n" +
                "4: \"Sandwich - $3.00\"\n" +
                "5: \"Water - $1.00\" \n");

        System.out.print("Input: ");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1: System.out.println("Chocolate Bar - $2.00"); break;
            case 2: System.out.println("Soda - $1.50" ); break;
            case 3: System.out.println("Chips - $1.20" ); break;
            case 4: System.out.println("Sandwich - $3.00"); break;
            case 5: System.out.println("Water - $1.00"); break;
            default: System.out.println("Invalid selection. Please enter a number between 1 and 5.");
        }
    }
}
