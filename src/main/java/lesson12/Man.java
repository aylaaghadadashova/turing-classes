package lesson12;

public class Man extends Human{

    public Man(){};

    public Man(String name, int age){
        super(name, age);
    }

    public Man(String name, int age, Dog dog, Cat cat){
        super(name, age, dog, cat);
    }

    @Override
    public String toString(){
        return "Man = {\n " +
                "Name: " + this.name +
                "\n Age: " + this.age +
                "\n Dog: " + this.dog.toString() +
                "\n Cat: " + this.cat.toString() +
                "\n}";
    }
}
