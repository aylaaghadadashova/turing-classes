package lesson12;

public class Main {

    public static void main(String[] args) {

        Man man = new Man("Bob", 32, new Dog(), new Cat());
        Woman woman = new Woman("Jane", 27, new Dog(), new Cat());
        Dog dog = new Dog("Max", 5);
        Cat cat = new Cat("Simba", 2);

        man.setCat(cat);
        man.setDog(dog);

        woman.setCat(cat);
        woman.setDog(dog);

        System.out.println(woman+"\n\n"+man);

    }
}
