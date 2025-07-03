package shapes;

import java.util.Scanner;

public class DiamondShapeApp {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //upper part:
        for(int i=1; i<=num+1; i++){
            for(int j=1; j<=(num-i+1)*2; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower part:
        for(int i=num; i>=1; i--){
            for(int j=1; j<=(num-i+1)*2;j++){
                System.out.print(" ");
            }

            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
