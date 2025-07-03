package lesson_n;

import java.util.Scanner;

public class DiamondShapeApp {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int spaceBound;
        int patternBound;
        for(int i = 1; i<=2*num+1; i++){
            spaceBound = i <= num+1 ? (num-i+1)*2: (i-num-1)*2;
            patternBound = i <= num+1 ? 2*i -1: 2*(2*num+1-i)+1;
            //System.out.println(spaceBound + " " + patternBound);

            for(int j =1; j<= spaceBound; j++){
                System.out.print(" ");
            }

            for(int j =1; j<=patternBound; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
