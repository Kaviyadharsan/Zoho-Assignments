package assignment10;


public class ZSGSStudent extends Student {
    public String course;
    public static int year;

    public ZSGSStudent(String name, int age, String course, int year) {
        super(name, age); 
        this.course = course;
        this.year = year;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
    
        ZSGSStudent student1 = new ZSGSStudent("Kaviyadharsan", 21, "Electronics And Communication Enginering", 2024);
        student1.displayDetails();

        ZSGSStudent student2 = new ZSGSStudent("Maha", 21, "Electrical Engineering", 2024);
        student2.displayDetails();

        
    }
}
