package lesson_n;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class SeatPlannerApp {
    public static void main(String[] args) {
        Random random = new Random();
        String[] students = {"Ayla", "Sevinc", "Aqil", "Ebulfez", "Huseyn", "Emin", "Rəmzi", "Orxan", "Saleh", "Sədulla", "Tural", "Ulvi", "Yusif"};
        int[] seats = new int[students.length];
        randomFill(seats, random);

        for(int i=0; i<students.length; i++){
            System.out.println(students[i] + ": " + seats[i]);
        }

    }
    public static boolean contains(int[] arr, int x) {
        for (int num : arr) {
            if (num == x) {
                return true;
            }
        }
        return false;
    }

    public static void randomFill(int[] arr, Random random){
        int element;
        for(int i =0; i< arr.length; i++){
            do{
                element = random.nextInt(arr.length+1);
            } while (contains(arr, element));
            arr[i] = element;
        }
    }
}



