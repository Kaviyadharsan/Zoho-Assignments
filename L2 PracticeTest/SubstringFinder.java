package l2test;

import java.util.Scanner;

public class SubstringFinder {

    public static int findSubstringIndex(String string1, String string2) {
        return string1.indexOf(string2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter String1: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter String2: ");
        String string2 = scanner.nextLine();

        
        int result = findSubstringIndex(string1, string2);

        
        System.out.println("Output: " + result);
    }
}
