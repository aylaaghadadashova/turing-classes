package lesson12;

public class Cat extends Animal{
    public Cat(){};

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public String toString(){
        return "Cat = {\n " +
                "Name: " + this.getName() +
                "\n Age: " + this.getAge() +
                "\n}";
    }
}
