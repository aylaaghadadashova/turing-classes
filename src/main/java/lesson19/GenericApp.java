package lesson19;

public class GenericApp {

    public static void main(String[] args) {

        BoxObjects<String, Integer, Double, String> foodBox =
                new BoxObjects<>("Apple", 10, 2.5, "kg");        BoxObjects<String, Double, Boolean, Integer> clothingBox =
                new BoxObjects<>("T-Shirt", 2.5, true, 300);
        BoxObjects<Product, Integer, String, Double> customBox =
                new BoxObjects<>(new Product("Laptop"), 1, "Electronics", 2.2);
        BoxObjects<Integer, String, Float, Long> mixedBox =
                new BoxObjects<>(12345, "single item", 99.99f, 1500L);

        System.out.println("--- FOOD BOX ---");
        System.out.println(foodBox);
        System.out.println("--- CLOTHING BOX ---");
        System.out.println(clothingBox);
        System.out.println("--- CUSTOM OBJECT BOX ---");
        System.out.println(customBox);
        System.out.println("--- MIXED BOX ---");
        System.out.println(mixedBox);
    }
}
