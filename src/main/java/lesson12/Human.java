package lesson12;

public class Human extends Animal{

    protected Dog dog;
    protected Cat cat;

    public Human(){};

    public Human(String name, int age){
        super(name, age);
    }

    public Human(Dog dog, Cat cat){
        this.dog = dog;
        this.cat = cat;
    }

    public Human(String name, int age, Dog dog, Cat cat){
        super(name, age);
        this.dog = dog;
        this.cat = cat;
    }

    //methods:
    public Dog getDog(){
        return this.dog;
    }

    public void setDog(Dog dog){
        this.dog = dog;
    }

    public Cat getCat(){
        return this.cat;
    }

    public void setCat(Cat cat){
        this.cat = cat;
    }

    @Override
    public String toString(){
        return "Human = {\n " +
                "Name: " + this.getName() +
                "\n Age: " + this.getAge() +
                "\n Dog: " + this.dog.toString() +
                "\n Cat: " + this.cat.toString() +
                "\n}";
    }
}
