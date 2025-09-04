package sortingtask;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double gpa;
    private String department;

    public Student(String name, int age, double gpa, String department) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int compareTo(Student std){
        int result = Double.compare(this.gpa, std.getGpa());
        if(result == 0){
            result = std.getName().compareTo(this.name);
            if(result == 0){
                result = Integer.compare(this.age, std.getAge());
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return age == student.age && Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name) && Objects.equals(department, student.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gpa, department);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", department='" + department +
                "}";
    }
}
