package Practice;
import java.util.Scanner;

public class Student_portal {
    String name;
    int rollNumber;
    float marks;
    public Student_portal(String name, int rollNumber, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Student_portal student1 = new Student_portal("Diplav Kushwaha", 37, 79.78f);
        Student_portal student2 = new Student_portal("Diwakar Kushwaha", 31, 75.34f);
        Student_portal student3 = new Student_portal("Himanshu Kushwaha", 41, 77.34f);
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();

    }
}
