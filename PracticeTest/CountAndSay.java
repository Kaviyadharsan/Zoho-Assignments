//Starting Time-03.00pm
//Ending Time-03.20pm


package practice;
public class CountAndSay {
    
    public String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = nextTerm(result);
        }
        return result;
    }

    private String nextTerm(String term) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        char prevChar = term.charAt(0);
        for (int i = 1; i < term.length(); i++) {
            char currChar = term.charAt(i);
            if (currChar == prevChar) {
                count++;
            } else {
                result.append(count).append(prevChar);
                count = 1;
                prevChar = currChar;
            }
        }
        result.append(count).append(prevChar);
        return result.toString();
    }

    public static void main(String[] args) {
        CountAndSay cas = new CountAndSay();
        System.out.println(cas.countAndSay(1)); // Output: "1"
        System.out.println(cas.countAndSay(2)); // Output: "11"
        System.out.println(cas.countAndSay(3)); // Output: "21"
        System.out.println(cas.countAndSay(4)); // Output: "1211"
        System.out.println(cas.countAndSay(5)); // Output: "111221"
    }
}



