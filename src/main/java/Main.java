import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
        double a =5;
        long b =7;
        int c = 3;


        System.out.printf("result: %d, %s, %.2f\n", 7, "salam", 5.58764);
        System.out.printf("result: %.0f\n",((a++) + (--b) - (a++) + (a+=3) + (++c)));
        */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a>b? "faxri" : a<b? "tural" : "murad");


    }
}
