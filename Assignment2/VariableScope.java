package assignment2;

public class VariableScope {
    public static void main(String[] args) {
      
        int outsideVariable = 10;

        if (outsideVariable > 5) {
            int insideVariable = 20;
            
            
            System.out.println("Inside the if block:");
            System.out.println("outsideVariable: " + outsideVariable);
            System.out.println("insideVariable: " + insideVariable);
        }

        System.out.println("Outside the if block:");
        System.out.println("outsideVariable: " + outsideVariable);
        
        // Trying to print the variable declared inside the if block will cause a compiler error because insideVariable is not in scope here
       
    }
}

