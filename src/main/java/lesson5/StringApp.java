package lesson5;

import java.util.Arrays;

public class StringApp {
    public static void main(String[] args) {
        String word = "Hello World";
        String word2 = "  Hello World";
        String word3 = "Salam %d %s";
        String newWord;

        System.out.println("lenth: " + word.length());
        System.out.println("equals: " + word.equals(new String(" Hello World")));
        System.out.println("equalsIgnoreCase: " + word.equalsIgnoreCase("HELLO WorLD"));
        System.out.println("toUpperCase: " + word.toUpperCase());
        System.out.println("toLowerCase: " + word.toLowerCase());

        System.out.println("compareTo: " + word.compareTo(word3));

        newWord = word.replace('o', '3');
        System.out.println("replace: " + newWord);
        String str = "Hello World Java";
        String replaced = str.replaceAll(" ", "-");
        System.out.println("replaceAll: " + replaced);
        String newWord2 = word.replaceFirst("l", "t");
        System.out.println("replaceFirst: " + newWord2);

        //word.chars().forEach(ch -> System.out.println((char)ch) );
        System.out.println("charAt: " + word.charAt(1));
        System.out.println("codePointAt: " + word.codePointAt(1));
        System.out.println("codePointBefore: " + word.codePointBefore(1));
        System.out.println("codePointCount: " + word.codePointCount(1, 7));
        System.out.println("trim: " + word2.trim());
        System.out.println("concat: " + word.concat("!"));
        System.out.println("\nsplit:");
        String[] words = word.split("l");
        for(String part :  words) System.out.println(part);

        System.out.println("contains: " + word.contains("i"));
        System.out.println("formatted:" + word3.formatted(123, "sagol"));

        //get bytes:
        byte[] bytes = word.getBytes();
        System.out.printf("getBytes: " + bytes[1]);

        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        word.getChars(4,7, arr, 2);
        System.out.println("\ngetChars: " + new String(arr));

        System.out.println("hashCode: " + word.hashCode());
        System.out.println("indexOf: " + word.indexOf('l')); //first occurrence
        System.out.println("lastIndexOf: " + word.lastIndexOf("l")); // last occurence


        //intern() --> returns value in string pool
        String a = new String("hello");
        String b = "hello";
        System.out.println("\nintern(): ");
        System.out.println(a==b);
        System.out.println(b == a.intern());

        String c  = new String();
        System.out.println("\nisEmpty: " + c.isEmpty());


        String fruits = String.join("/ ", "Apple", "Orange", "Grape");
        System.out.println("join: " + fruits);

        System.out.println("matches: " + "Hello".matches("World|Hello"));
        System.out.println("regionMatches: " + word.regionMatches(0, word2, 2, 5 ));

        String s = "A😊B";
        System.out.println("offsetByCodePoints: " + s.offsetByCodePoints(1,1)); //determine the next character's index

        System.out.println("startWith: " + word.startsWith("H"));
        System.out.println("subSequence: " + word.subSequence(2, 10)); // return type is CharSequence
        System.out.println("substring: " + word.substring(2, 10));
        System.out.println("valueOf: " + String.valueOf(arr)); //Return a string representation of different data types:
        System.out.println(Arrays.toString(arr));
        System.out.println(new String(arr));



    }
}
