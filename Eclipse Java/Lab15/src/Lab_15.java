import java.util.Scanner;
public class Lab_15 {

	  public static void main(String[] args) {
		  
		  boolean loop = true;
		  Scanner scan = new Scanner(System.in);//Activates scanner
		  System.out.println("\nHow far is the target: ");
	      double distance = scan.nextDouble();//Distance is a not changed so user can find what distance is without
	      									  ///having to keep typing it
		  
		  while (loop) {

	      System.out.println("\nHow many kg of gunpowder: ");
	      double kg_gunpowder = scan.nextDouble() * 10;
	      
	      System.out.println("What angle: ");
	      double angle = scan.nextDouble();
	      
	      double gravity = 9.8;
	    
	      double velocity_x = kg_gunpowder * Math.cos(Math.toRadians(angle));//converts degrees to radians
	    
	      double velocity_y = kg_gunpowder * Math.sin(Math.toRadians(angle));
	  
	      double time_apex = velocity_y / gravity * 2;//multiplied by 2 because we got half a parabola
	      	      
	      double final_distance = velocity_x * time_apex;
	      
	      
	      
	      if (final_distance - distance > 1)//if final is greater than initial then prints how far past it went
	      {
	    	  
	    	  System.out.printf("Your shot went %.2fm past the target",(final_distance - distance) );
	      }
	      
	      else if (distance - final_distance > 1)//if final is less than initial then prints how short final distance got
	      { 
	    	  System.out.printf("Your shot went %.2fm short of the target",(distance-final_distance) );

		  }
	      else//hits the target
	      {
    	  	loop = false;
    	  	System.out.println("\nYou hit it the target!");
	      
	      }
	}
  }
}