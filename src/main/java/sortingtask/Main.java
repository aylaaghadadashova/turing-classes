package sortingtask;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Student[] students = {
                new Student("A", 20, 3.8, "Information Security"),
                new Student("B", 21, 3.5, "Computer Science"),
                new Student("N", 29, 3.8, "Mathematics"),
                new Student("N", 22, 3.8, "Economics"),
                new Student("L", 20, 3.7, "Design"),
        };

        //Arrays.sort(students);

        //Arrays.sort(students, (Student std1, Student std2) -> ((Integer) std1.getAge()).compareTo(std2.getAge()));

//        Arrays.sort(students, new Comparator<Student>() {
//                    @Override
//                    public int compare(Student std1, Student std2) {
//                        return std1.getAge()-std2.getAge();
//                    }
//                });

        //Arrays.sort(students, new StudentGpaComparator());

        //Arrays.sort(students, new StudentNameComparator());
        printInfo(students);
    }

    public static void printInfo(Student[] students){
        for(Student student : students){
            System.out.println(student);
        }
    }
}
