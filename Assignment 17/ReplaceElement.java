import java.util.LinkedList;
import java.util.ListIterator;

public class ReplaceElement{
    public static void main(String[] args) {

        LinkedList<String> words = new LinkedList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");


        ListIterator<String> iterator = words.listIterator();


        while (iterator.hasNext()) {
            String currentWord = iterator.next();
            if (currentWord.equals("three")) {
                iterator.set("THREE"); // Replace the word "three" with "THREE"
            }
        }


        System.out.println("Modified LinkedList: " + words);
    }
}

