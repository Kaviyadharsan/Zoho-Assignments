package l2test;

public class PairDivisionChecker {

    public static boolean canDivideIntoPairs(int[] nums) {
        int[] count = new int[500]; 

        // Count the frequency of each element in the nums array
        for (int num : nums) {
            count[num]++;
        }

        // Check if each number can be paired
        for (int i = 1; i < count.length; i++) {
            if (count[i] % 2 != 0) { 
       // If the frequency of any number is odd, return false
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        
        int[] nums1 = {3, 2, 3, 2, 2, 2};
        System.out.println("Test Case 1: " + canDivideIntoPairs(nums1)); 

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test Case 2: " + canDivideIntoPairs(nums2)); 
    }
}
