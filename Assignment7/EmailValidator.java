package assignment7;
public class EmailValidator {

    public static void main(String[] args) {
        String email1 = "kaviyatharsan001@gmail.com";
        String email2 = "Kaviyatharsan001gmail com";
        
        System.out.println("Is '" + email1 + "' a valid email? " + isValidEmail(email1));
        System.out.println("Is '" + email2 + "' a valid email? " + isValidEmail(email2));
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atPos = email.indexOf('@');
        int dotPos = email.lastIndexOf('.');

        // Check if '@' is present and is not the first or last character
        if (atPos <= 0 || atPos == email.length() - 1) {
            return false;
        }

        // Check if '.' is present and is not the last character, and it comes after '@'
        if (dotPos <= atPos + 1 || dotPos == email.length() - 1) {
            return false;
        }

        // Check that there's only one '@'
        if (email.indexOf('@', atPos + 1) != -1) {
            return false;
        }

        // Ensure no spaces are present
        if (email.contains(" ")) {
            return false;
        }

        return true;
    }
}

