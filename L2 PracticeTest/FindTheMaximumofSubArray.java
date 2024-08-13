
package l2test;
public class FindTheMaximumofSubArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int K1 = 3;
        System.out.println("Output for First Array");
        findMaxForEachSubarray(arr1, K1);  
        System.out.println();

      
        int[] arr2 = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int K2 = 4;
        System.out.println("Output for Second Array");
        findMaxForEachSubarray(arr2, K2); 
    }

  public static void findMaxForEachSubarray(int[] arr, int K) {
      int n = arr.length;

     // Traverse the array
     for (int i = 0; i <= n - K; i++) {
         int max = arr[i];  

       
         
         // Traverse through the current subarray of size K
         for (int j = 1; j < K; j++) {
             if (arr[i + j] > max) {
                 max = arr[i + j];  
             }
         }

         // Print the maximum of the current subarray
         System.out.print(max + " ");
     }

     System.out.println();
}
}
