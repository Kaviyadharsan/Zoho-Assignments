package assignment7;


public class StringReverser {

    public static void main(String[] args) {
        String input = "Hello World!";
        String reversedString = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}

