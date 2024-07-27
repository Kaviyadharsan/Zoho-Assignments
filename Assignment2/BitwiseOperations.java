package assignment2

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        
        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;
        int leftShiftResult = num1 << 1;
        int rightShiftResult = num1 >> 1;
        int leftShiftResult2 = num2 << 1;
        int rightShiftResult2 = num2 >> 1;
        
        System.out.println("Bitwise AND of " + num1 + " and " + num2 + " is: " + andResult);
        System.out.println("Bitwise OR of " + num1 + " and " + num2 + " is: " + orResult);
        System.out.println("Bitwise XOR of " + num1 + " and " + num2 + " is: " + xorResult);
        System.out.println("Left shift of " + num1 + " by 1 is: " + leftShiftResult);
        System.out.println("Right shift of " + num1 + " by 1 is: " + rightShiftResult);
        System.out.println("Left shift of " + num2 + " by 1 is: " + leftShiftResult2);
        System.out.println("Right shift of " + num2 + " by 1 is: " + rightShiftResult2);

        scanner.close();
    }
}


