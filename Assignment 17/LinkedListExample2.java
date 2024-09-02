import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();


        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        numbers.remove(2);


        numbers.removeLast();


        System.out.println("Resulting LinkedList: " + numbers);
    }
}

