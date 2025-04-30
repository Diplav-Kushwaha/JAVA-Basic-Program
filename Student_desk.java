package Practice;

import java.util.Scanner;
public class Student_desk {
    String  Name;
    String F_Name;
    String M_Name;
    String Sch_Name;
    String Class;
    int Age;
    long  phone_no;

    public void display(){
        System.out.println("::____________Student Detail_____________::");
        System.out.println("Student Name          : "+Name);
        System.out.println("Student Father's Name : "+F_Name);
        System.out.println("Student Mother's Name : "+M_Name);
        System.out.println("Student School Name   : "+Sch_Name);
        System.out.println("Student Class         : "+Class);
        System.out.println("Student Age           : "+Age);
        System.out.println("Student Phone         : "+phone_no);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_desk std1 = new Student_desk();

        System.out.print("Your name : ");
        std1.Name = sc.nextLine();
        System.out.print("Your Father's name : ");
        std1.F_Name = sc.nextLine();
        System.out.print("Your Mother's name : ");
        std1.M_Name = sc.nextLine();
        System.out.print("Your School name : ");
        std1.Sch_Name = sc.nextLine();
        System.out.print("Your Class : ");
        std1.Class = sc.nextLine();
        System.out.print("Your Age : ");
        std1.Age = sc.nextInt();
        System.out.print("Your Phone no. : ");
        std1.phone_no = sc.nextLong();

        std1.display();
    }
}
