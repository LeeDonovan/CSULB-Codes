import java.util.*;
public class Studenttester{

    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        Student s1 = new Student(016741645, 40,120,0);
        Student s2 = new Student(012554544, 32,24,0);
        Student s3 = new Student(012222245, 70,100,0);
        while(loop == true)
        {
            String s1_string = String.valueOf(s1.getID());
            String s2_string = String.valueOf(s2.getID());
            String s3_string = String.valueOf(s3.getID());
            System.out.println("Main Menu");
            System.out.println("1. " + s1_string);
            System.out.println("2. " + s2_string);
            System.out.println("3. " +  s3_string);
            System.out.println("4. Leave Menu");
            System.out.println("Choose 1 or 2 or 3 or 4: ");
            int x = scan.nextInt();
                if (x == 1)
                {
                    boolean keep_going = true;  
                    System.out.println("Student 1 Profile");
                    System.out.println("1. Change Student's ID Number");
                    System.out.println("2. Change Student's Hours");
                    System.out.println("3. Change Student's Credits");
                    System.out.println("4. Check Student's GPA");
                    System.out.println("5. See Student's Profile");
                    System.out.println("6. Log Off Profile");
                    int y = scan.nextInt();
                    while(keep_going == true)
                    {
                        if (y == 1)
                        {
                            System.out.println("Set the new ID for Student: ");
                            String a = scan.next();
                            int z = Integer.parseInt(a);
                            s1.setID(z);
                            System.out.println("New ID for Student 1 is " + a);
                            String s1_last = String.valueOf(s1.getLastStudent());
                            System.out.println("Last Student ID: " + s1_last);
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
                            System.out.printf("%.2f",s1.getGPA());
                            System.out.println("\n");
                            keep_going = false;
                            
                        }
                        if (y == 5)
                        {
                            System.out.println("ID: " + s1.getID() + " Credit of Hours: " + s1.getHrs() + 
                                                " Number of Points: " + s1.getPts() + " GPA: " + s1.getGPA());
                            keep_going = false;
                        }
                        if (y == 6)
                        {
                            System.out.println("Logging off Student 1");
                            keep_going = false;
                        }
                    }
                }
                if (x == 2)
                {
                    boolean keep_going1 = true;  
                    System.out.println("Student 1 Profile");
                    System.out.println("1. Change Student's ID Number");
                    System.out.println("2. Change Student's Hours");
                    System.out.println("3. Change Student's Credits");
                    System.out.println("4. Check Student's GPA");
                    System.out.println("5. See Student's Profile");
                    System.out.println("6. Log Off Profile");
                    int po = scan.nextInt();
                    while(keep_going1 == true)
                    {
                        if (po == 1)
                        {
                            System.out.println("Set the new ID for Student: ");
                            String b = scan.next();
                            int c = Integer.parseInt(b);
                            s2.setID(c);
                            System.out.println("New ID for Student 1 is " + b);
                            String s2_last = String.valueOf(s2.getLastStudent());
                            System.out.println("Last Student ID: " + s2_last);
                            keep_going1 = false;


                        }
                        if (po == 2)
                        {
                            System.out.println("Set new hours for Student: ");
                            int uz = scan.nextInt();
                            s2.setHrs(uz);
                            System.out.println("New Hours for Student 1 is: "+ uz);
                            break;
                        }
                        if (po == 3)
                        {
                            System.out.println("Set new credits for Student: ");
                            int qo = scan.nextInt();
                            s2.setHrs(qo);
                            System.out.println("New Credits for Student 1 is: "+ qo);
                            break;
                        }
                        if (po == 4)
                        {
                            System.out.printf("%.2f",s2.getGPA());
                            System.out.println("\n");
                            keep_going1 = false;
                            
                        }
                        if (po == 5)
                        {
                            System.out.println("ID: " + s2.getID() + " Credit of Hours: " + s2.getHrs() + 
                                                " Number of Points: " + s2.getPts() + " GPA: " + s2.getGPA());
                            keep_going1 = false;
                        }
                        if (po == 6)
                        {
                            System.out.println("Logging off Student 2");
                            keep_going1 = false;
                        }
                    }
                }

                if (x == 3)
                {
                    boolean keep_going2 = true;  
                    System.out.println("Student 3 Profile");
                    System.out.println("1. Change Student's ID Number");
                    System.out.println("2. Change Student's Hours");
                    System.out.println("3. Change Student's Credits");
                    System.out.println("4. Check Student's GPA");
                    System.out.println("5. See Student's Profile");
                    System.out.println("6. Log Off Profile");
                    int zo = scan.nextInt();
                    while(keep_going2 == true)
                    {
                        if (zo == 1)
                        {
                            System.out.println("Set the new ID for Student: ");
                            String ai = scan.next();
                            int zi = Integer.parseInt(ai);
                            s3.setID(zi);
                            System.out.println("New ID for Student 1 is " + ai);
                            String s3_last = String.valueOf(s3.getLastStudent());
                            System.out.println("Last Student ID: " + s3_last);
                            keep_going2 = false;


                        }
                        if (zo == 2)
                        {
                            System.out.println("Set new hours for Student: ");
                            int uio = scan.nextInt();
                            s3.setHrs(uio);
                            System.out.println("New Hours for Student 1 is: "+ uio);
                            break;
                        }
                        if (zo == 3)
                        {
                            System.out.println("Set new credits for Student: ");
                            int qua = scan.nextInt();
                            s3.setHrs(qua);
                            System.out.println("New Credits for Student 1 is: "+ qua);
                            break;
                        }
                        if (zo == 4)
                        {
                            System.out.printf("%.2f",s3.getGPA());
                            System.out.println("\n");
                            keep_going2 = false;
                            
                        }
                        if (zo == 5)
                        {
                            System.out.println("ID: " + s3.getID() + " Credit of Hours: " + s3.getHrs() + 
                                                " Number of Points: " + s3.getPts() + " GPA: " + s3.getGPA());
                            keep_going2 = false;
                        }
                        if (zo == 6)
                        {
                            System.out.println("Logging off Student 3");
                            keep_going2 = false;
                        }
                    }
                }

                if (x == 4)
                {
                    loop = false;
                    
                }
                
        }

    }
}