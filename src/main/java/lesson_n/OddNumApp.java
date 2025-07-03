package lesson_n;

import java.util.Arrays;

public class OddNumApp {
    public static void main(String[] args) {
        int[] arr = {1, 56, 78, 3, 67, 90, 45};
        /*
        // solution1:
        int count = 0;
        for(int num : arr){
            if (num%2 != 0){
                count++;
            }
        }
        int[] oddNumbers = new int[count];
        int index =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                oddNumbers[index] = arr[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(oddNumbers));
        */

        // solution2:
        int[] temp = new int[arr.length];
        int index = 0;
        for(int num : arr){
            if(num % 2 != 0){
                temp[index] = num;
                index++;
            }
        }

        int[] odds = Arrays.copyOf(temp, index);
        System.out.println(Arrays.toString(odds));

        // solution3 could be with appending odds to stringbuilder but it would be inefficient
    }
}
