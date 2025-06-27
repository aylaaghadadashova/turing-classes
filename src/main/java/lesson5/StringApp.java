package lesson5;

public class StringApp {
    public static void main(String[] args) {
        String word = "Hello World";
        String word2 = "  Hello World";
        String word3 = "Salam %d %s";
        String newWord;

        System.out.println("equals: " + word.equals(word2));
        System.out.println("toUpperCase: " + word.toUpperCase());
        System.out.println("compareTo: " + word.compareTo(word3));

        newWord = word.replace('o', '3');
        System.out.println("Replace: " + newWord);

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

        char[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        word.getChars(4,7, arr, 2);
        System.out.println("\n" + arr.toString());


    }
}
