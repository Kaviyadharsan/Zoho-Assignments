//Starting Time-04.50pm
//Ending Time-5.20pm


package practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));    // Output: 3
        System.out.println(romanToInt("LVIII"));  // Output: 58
        System.out.println(romanToInt("MCMXCV")); // Output: 1994
    }

    public static int romanToInt(String s) {
        // Map to store Roman numerals and their values
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Process each character in the Roman numeral string
        for (char ch : s.toCharArray()) {
            int value = romanToIntMap.get(ch);
            if (value > prevValue) {
                total += value - 2 * prevValue;
            } else {
                total += value;
            }
            prevValue = value;
        }

        return total;
    }
}

