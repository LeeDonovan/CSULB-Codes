import java.util.*;

public class CarRental{


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("    Welcome to Car Rental");
        System.out.println("What Car Size Are You Looking For?");
        System.out.println("1.  Economy");
        System.out.println("2.  Medium");
        System.out.println("3.  Full-Size");
        int x = scan.nextInt();
        System.out.println("Do you want the car with a GPS too? (Y/N)");
        String sure = scan.next();
        CarGPS car = new CarGPS();
        String vehicle = car.typeCar(x);
        int value = car.getCar(x);
        if (sure.equalsIgnoreCase("Y"))
        {
            value = car.setGPS(value);
        }
        System.out.println("How many days would you like to rent the " + vehicle + " car? ");
        int day = scan.nextInt();
        int total = day*value;
        System.out.println("Your total will be $" + total + " for a " + vehicle + " car.");

        
        

    }
}