package assignment4;
import java.util.Scanner;

public class LoginSystem {

    private static String storedUsername;
    private static String storedPassword;

    // Static block to initialize hardcoded username and password
    static {
        storedUsername = "Kaviyadharsan";
        storedPassword = "Dharsan@2003";
    }

    public static boolean authenticate(String username, String password) {
        return storedUsername.equals(username) && storedPassword.equals(password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        scanner.close();
    }
}


