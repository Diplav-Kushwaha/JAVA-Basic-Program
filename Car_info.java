package Practice;

import java.util.Scanner;
public class Car_info {
    String car_name;
    int car_seat;
    int car_wheel;
    double car_maxSpeed;
    double car_currentSpeed;
    double car_maxFuel;
    double car_currentFuel;
    public void Display(){
        System.out.println("::___________Yours Car Info___________::");
        System.out.println("Car Name          : "+car_name);
        System.out.println("Car Wheels        : "+car_wheel);
        System.out.println("Car Seats         : "+car_seat);
        System.out.println("Car Max Speed     : "+car_maxSpeed);
        System.out.println("Car Current Speed : "+car_currentSpeed);
        System.out.println("Car Fuel Capacity : "+car_maxFuel);
        if(car_currentFuel==0){
            System.out.println("Fuel tank is empty, Please refuel");
        }else if(car_currentFuel<=5){
            System.out.println("Fuel is too low, "+car_currentFuel+" ltr Please refuel");
        }else{
            System.out.println("Current fuel : "+car_currentFuel);
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Car_info carinfo = new Car_info();
        System.out.print("What's your car name : ");
        carinfo.car_name=sc.nextLine();
        System.out.print("How many wheels have your car : ");
        carinfo.car_wheel=sc.nextInt();
        System.out.print("How many seats have your car : ");
        carinfo.car_seat=sc.nextInt();
        System.out.print("What's maximum speed of your car : ");
        carinfo.car_maxSpeed=sc.nextDouble();
        System.out.print("What's current speed of your car : ");
        carinfo.car_currentSpeed=sc.nextDouble();
        System.out.print("What's maximum fuel capacity of your car in ltr : ");
        carinfo.car_maxFuel=sc.nextDouble();
        System.out.print("What's current fuel in your car in ltr : ");
        carinfo.car_currentFuel=sc.nextDouble();

        carinfo.Display();
    }
}

