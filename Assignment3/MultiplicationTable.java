package assignment2;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        
        scanner.close();

        
        System.out.println("Multiplication Table for " + number);
        System.out.println("----------------------------------");
   

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }
    }
}

