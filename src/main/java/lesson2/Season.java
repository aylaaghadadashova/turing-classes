package lesson2;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(num == 12 || num == 1 || num == 2 ? "Qış": num == 3 || num == 4 || num == 5? "Yaz" : num ==6 || num == 7 || num == 8? "Yay": num == 9 || num == 10 || num ==11? "Payız": "Yalnış ay" );
    }
}
