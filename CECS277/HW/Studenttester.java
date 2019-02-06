import java.util.*;
public class Studenttester{

    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        Student s1 = new Student(016741645, 40,120);
        Student s2 = new Student(012554544, 32,24);
        Student s3 = new Student(012222245, 70,100);
        while(loop == true)
        {
            System.out.println("Main Menu");
            System.out.println("1. 016741645");
            System.out.println("2. 012554544");
            System.out.println("3. 012222245");
            System.out.println("4. Leave Menu");
            System.out.println("Choose a 1 or 2 or 3 or 4: ");
            int x = scan.nextInt();
                if (x == 1)
                {
                    boolean keep_going = true;  
                    System.out.println("Student 1 Profile");
                    System.out.println("1. Change Student's ID Number");
                    System.out.println("2. Change Student's Hours");
                    System.out.println("3. Change Student's Credits");
                    System.out.println("4. See Student's Profile");
                    int y = scan.nextInt();
                    while(keep_going == true)
                    {
                        if (y == 1)
                        {
                            System.out.println("Set the new ID for Student: ");
                            int z = scan.nextInt();
                            s1.setID(z);
                            System.out.println("New ID for Student 1 is " + z);
                            System.out.println("Would you like to see last number of Student ID? (Y/N): ");
                            String sure = scan.next();
                            if (sure == "Y" || sure == "y")
                            {
                                String s = String.valueOf(z);
                                String rev = s1.lastStudentID(s);
                                char first = rev.charAt(0);
                                System.out.println(first);
                            }
                            else if (sure == "N" || sure == "n")
                            {
                                System.out.println("Oh ok.");
                            }
                            keep_going = false;


                        }
                        if (y == 2)
                        {
                            System.out.println("Set new hours for Student: ");
                            int u = scan.nextInt();
                            s1.setHrs(u);
                            System.out.println("New Hours for Student 1 is: "+ u);
                            break;
                        }
                        if (y == 3)
                        {
                            System.out.println("Set new credits for Student: ");
                            int q = scan.nextInt();
                            s1.setHrs(q);
                            System.out.println("New Credits for Student 1 is: "+ q);
                            break;
                        }
                        if (y == 4)
                        {
                            break;
                        }
                    }
                }
        }

    }
}