package assignment4;

public class Person {
    private String name;
    private int age;
    private String address;

    // First constructor takes a single String argument for the name
    public Person(String name) {
        this.name = name;
    }

    // Second constructor takes a String argument for the name and an int argument for the age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Third constructor takes a String argument for the name, an int argument for the age, and a String argument for the address
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        if (age > 0) {
            System.out.println("Age: " + age);
        }
        if (address != null) {
            System.out.println("Address: " + address);
        }
    }

    public static void main(String[] args) {
        // Creating instances using different constructors
        Person person1 = new Person("Kaviyadharsan");
        Person person2 = new Person("Dharsan", 20);
        Person person3 = new Person("Gokul", 27, "42,Kalathur");

        // Display details of each person
        person1.displayDetails();
        System.out.println();
        person2.displayDetails();
        System.out.println();
        person3.displayDetails();
    }
}

