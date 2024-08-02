package assignment7;

public class SentenceReverser {

   public static void main(String[] args) {
        String input = "Hello World! This is a test.";
        String reversedSentence = reverseWords(input);
        System.out.println("Original Sentence: " + input);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }
}

