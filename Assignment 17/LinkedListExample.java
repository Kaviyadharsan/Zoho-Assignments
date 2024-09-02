import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();


        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);


        int firstElement = numbers.getFirst();


        int lastElement = numbers.getLast();


        System.out.println("First element in the list: " + firstElement);
        System.out.println("Last element in the list: " + lastElement);
    }
}

