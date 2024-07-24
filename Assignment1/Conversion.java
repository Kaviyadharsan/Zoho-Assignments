public class Conversion {
    
    public static void main(String[] args) {
        
        // float to int
        float floatNumber = 10.5f;
        int intNumber = (int) floatNumber; 
        System.out.println("Float to Int Conversion:");
        System.out.println("float number: " + floatNumber);
        System.out.println("Converted int number: " + intNumber);
        System.out.println();
        
        // double to float
        double doubleNumber = 20.75;
        float floatNumber2 = (float) doubleNumber; 
        System.out.println("Double to Float Conversion:");
        System.out.println("double number: " + doubleNumber);
        System.out.println("Converted float number: " + floatNumber2);
        System.out.println();
        
        // int to short
        int intValue = 500;
        short shortValue = (short) intValue; 
        System.out.println("Int to Short Conversion:");
        System.out.println("int value: " + intValue);
        System.out.println("Converted short value: " + shortValue);
    }
}

