package lesson12;

public class Animal {

    private String name;
    private int age;

    public Animal(){};

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //methods:
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Animal = {\n " +
                "Name: " + this.name +
                "\n Age: " + this.age +
                "\n}";
    }
}
