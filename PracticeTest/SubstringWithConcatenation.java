//Starting Time-04.00pm
//Ending Time-04.40pm

package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenation {
    
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;

        // Create a hashmap to count the frequency of each word in words array
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Iterate over the string s with a sliding window approach
        for (int i = 0; i <= s.length() - totalLength; i++) {
            Map<String, Integer> seenWords = new HashMap<>();
            int j = 0;
            while (j < wordCount) {
                int wordIndex = i + j * wordLength;
                String currentWord = s.substring(wordIndex, wordIndex + wordLength);
                if (!wordMap.containsKey(currentWord)) {
                    break;
                }
                seenWords.put(currentWord, seenWords.getOrDefault(currentWord, 0) + 1);
                if (seenWords.get(currentWord) > wordMap.get(currentWord)) {
                    break;
                }
                j++;
            }
            if (j == wordCount) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SubstringWithConcatenation swc = new SubstringWithConcatenation();
        System.out.println(swc.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"})); // Output: [0, 9]
        System.out.println(swc.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"})); // Output: []
        System.out.println(swc.findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"})); // Output: [6, 9, 12]
    }
}

