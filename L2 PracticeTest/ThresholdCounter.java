package l2test;
import java.util.Scanner;

public  class ThresholdCounter {
    
    public static int countParts(int[] array, int threshold) {
        int totalParts = 0;
        
        for (int num : array) {
        	//Formula For Calculate Number Of Parts
            int parts = (num + threshold - 1) / threshold;
            totalParts += parts;
        }
        
        return totalParts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] array = {5, 8, 10, 13, 6, 2};
        
        System.out.print("Enter the threshold value: ");
        int threshold = scanner.nextInt();
        
        int result = countParts(array, threshold);
        System.out.println("Count = " + result);
    }
}
