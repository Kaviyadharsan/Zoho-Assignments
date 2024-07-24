import java.util.Scanner;

public class WeekdayName {

    // Enum defining days of the week
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Enter a number (1-7) to get the weekday name: ");
        int dayNumber = scanner.nextInt();

        
        Day[] days = Day.values();
        if (dayNumber >= 1 && dayNumber <= 7) {
            Day choosenDay = days[dayNumber - 1];
            System.out.println("The weekday is: " + choosenDay);
        } else {
            System.out.println("Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}

