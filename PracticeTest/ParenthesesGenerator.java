//Starting Time-02.40pm
//Ending Time-03.00pm

package practice;
import java.util.ArrayList;
import java.util.List;

public class ParenthesesGenerator {
    
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        ParenthesesGenerator pg = new ParenthesesGenerator();
        System.out.println(pg.generateParenthesis(1)); // Output: ["((()))","(()())","(())()","()(())","()()()"]
        System.out.println(pg.generateParenthesis(4)); // Output: ["()"]
    }
}

