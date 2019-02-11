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
        
        if (x == 1)
        {
            if(sure.equalsIgnoreCase("Y"))
            {
                CarGPS eco = new CarGPS();//create car
                int eco1 = eco.getCar(x);
                int eco2 = eco.setGPS(eco1);
                String eco3 = String.valueOf(eco2);
                String ecoS = String.valueOf(eco1);
                System.out.println("The price of an Economy car with a GPS is " + eco2);
                System.out.println("How many days would you like to rent the car: ");
                int day = scan.nextInt();
                int total = day*eco2;
                System.out.println("Your total will be $" + total); 
            }
            else 
            {
                Car eco = new Car();
                int ecoP = eco.getCar(x);
                String ecoS = String.valueOf(ecoP);
                System.out.println("The price of an Economy car without a GPS is " + ecoP);
                System.out.println("How many days would you like to rent the car: ");
                int day1 = scan.nextInt();
                int total1 = day1*ecoP;
                System.out.println("Your total will be $" + total1); 
            }
            

        }

        if ( x == 2)
        {
            if(sure.equalsIgnoreCase("Y"))
            {
                CarGPS med = new CarGPS();//create car
                int med1 = med.getCar(x);
                int med2 = med.setGPS(med1);
                String med3 = String.valueOf(med2);
                String medS = String.valueOf(med1);
                System.out.println("The price of a Medium car with a GPS is " + med2);
                System.out.println("How many days would you like to rent the car: ");
                int day3 = scan.nextInt();
                int total3 = day3*med2;
                System.out.println("Your total will be $" + total3); 
            }
            else 
            {
                Car med = new Car();
                int medP = med.getCar(x);
                String medS = String.valueOf(medP);
                System.out.println("The price of a Medium car without a GPS is " + medP);
                System.out.println("How many days would you like to rent the car: ");
                int day4 = scan.nextInt();
                int total4 = day4*medP;
                System.out.println("Your total will be $" + total4); 
            }
        }

        if ( x == 3)
        {
            if(sure.equalsIgnoreCase("Y"))
            {
                CarGPS fulls = new CarGPS();//create car
                int full1 = fulls.getCar(x);
                int full2 = fulls.setGPS(full1);
                String full3 = String.valueOf(full1);
                String full4 = String.valueOf(full2);
                System.out.println("The price of a Medium car with a GPS is " + full2);
                System.out.println("How many days would you like to rent the car: ");
                int dayz = scan.nextInt();
                int totalz = dayz*full2;
                System.out.println("Your total will be $" + totalz); 
            }
            else 
            {
                Car fully = new Car();
                int fullP = fully.getCar(x);
                String fullS1 = String.valueOf(fullP);
                System.out.println("The price of a Medium car without a GPS is " + fullP);
                System.out.println("How many days would you like to rent the car: ");
                int dayly = scan.nextInt();
                int totally = dayly*fullP;
                System.out.println("Your total will be $" + totally); 
            }
        }
        

    }
}