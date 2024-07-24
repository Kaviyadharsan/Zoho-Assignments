import java.util.Scanner;

public class AverageWeightCalculator {

    public static void main(String[] args) {
        int numberOfPeople = 10;
        double totalWeight = 0.0;
        double averageWeight;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= numberOfPeople; i++) {
            System.out.print("Enter weight of person " + i + " (in kilograms): ");
            double weight = scanner.nextDouble();
            totalWeight += weight;
        }

        averageWeight = totalWeight / numberOfPeople;

        System.out.println("Average weight of " + numberOfPeople + " people is: " + averageWeight + " kilograms");

        scanner.close();
    }
}

