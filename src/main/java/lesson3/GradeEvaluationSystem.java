package lesson3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class GradeEvaluationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("[,\\s*]+");
        System.out.print("Scores: ");
        float exam1 = scanner.nextFloat();
        float exam2 = scanner.nextFloat();
        float exam3 = scanner.nextFloat();

        float average = (exam1 + exam2+ exam3)/3;

        if (exam1<=40 || exam2<=40 || exam3<=40) System.out.println("Failed - One or more exam scores are too low.");
        else if (average>=85 && exam1>=85 && exam2>=85 && exam3>=85) System.out.println("Congratulations! You have earned a Certificate of Excellence.");
        else if (average>=70 && average<85 && exam1>=60 && exam2>=60 && exam3>=60) System.out.println("Well done! You have earned a Certificate of Achievement.");
        else if (average>=50 && average<70) System.out.println("You passed.");
        else System.out.println("Failed.");
    }
}
