package lesson12;

public class Dog extends Animal{

    public Dog(){};

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public String toString(){
        return "Dog = {\n " +
                "Name: " + this.getName() +
                "\n Age: " + this.getAge() +
                "\n}";
    }
}
