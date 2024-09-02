import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListReversal {
    public static void main(String[] args) {

        LinkedList<Character> characters = new LinkedList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');


        System.out.println("Original LinkedList: " + characters);


        LinkedList<Character> reversedList = reverseLinkedList(characters);


        System.out.println("Reversed LinkedList: " + reversedList);
    }


    public static LinkedList<Character> reverseLinkedList(LinkedList<Character> list) {
        LinkedList<Character> reversedList = new LinkedList<>();


        ListIterator<Character> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }

        return reversedList;
    }
}

