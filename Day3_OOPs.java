package lOO_DaysOfCode;
import java.util.Scanner;

class Information{

    public String name;    // Public access modifier
    private long phone_no; // Private access modifier
    int age;               // Default access modifier
    private String address;// Private access modifier
    public void Display(){
        System.out.println("Name  : "+name);
        System.out.println("Age  : "+age);
        System.out.println("Phone :  "+phone_no);
        System.out.println("Address:  "+address);
    }
    public long getPhone_no() { // here we use getter function for storing data into private variable.
        return phone_no;
    }
    public void setPhone_no(long phone_no){ // here we use setter function for set final value in private variable.
        this.phone_no=phone_no;
    }
    public String getAddress() {
        return address;  //here we use this key word for marking original variable then the attribute.
    }

    public void setAddress(String address) {
        this.address = address; //here we use this key word for marking original variable then the attribute.
    }
}
public class Day3_OOPs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Information b_info = new Information();
        b_info.name=sc.nextLine();
        b_info.age=sc.nextInt();
        b_info.setPhone_no(sc.nextLong());
        sc.nextLine();
        b_info.setAddress(sc.nextLine());
        b_info.Display();
    }
}
