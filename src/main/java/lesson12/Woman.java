package lesson12;

public class Woman extends Human{

    public Woman(){};

    public Woman(String name, int age){
        super(name, age);
    }

    public Woman(String name, int age, Dog dog, Cat cat){
        super(name, age, dog, cat);
    }

    @Override
    public String toString(){
        return "Woman = {\n " +
                "Name: " + this.name +
                "\n Age: " + this.age +
                "\n Dog: " + this.dog.toString() +
                "\n Cat: " + this.cat.toString() +
                "\n}";
    }
}
