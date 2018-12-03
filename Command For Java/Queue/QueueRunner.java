import java.util.*;


public class QueueRunner {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedListQueue iPhone = new LinkedListQueue();
		Person temp;
		System.out.println("Fill up the queue with people ahead of me.");
		iPhone.add2Queue(new Person("Britney", "Spears"));
		iPhone.add2Queue(new Person("Chevvy", "Chase"));
		iPhone.add2Queue(new Person("Sandra", "Bullock"));
		System.out.println("After loading up the queue with famous people:");
		iPhone.printQ();
		System.out.println("size = " + iPhone.getSize());
		iPhone.add2Queue(new Person("Dave", "Brown"));
		iPhone.add2Queue(new Person("Mary", "Brown"));
		System.out.println("After adding me and Mary");
		System.out.println("Left in queue = " + iPhone.getSize());
		iPhone.printQ();
		System.out.println("add some non-descript person");
		iPhone.add2Queue(new Person("Joshua", "Nun"));
		System.out.println("Left in queue = " + iPhone.getSize());
		iPhone.printQ();
		iPhone.getOff();
		System.out.println("Now they are gone.");
		System.out.println("size = " + iPhone.getSize());
		iPhone.printQ();
		System.out.println("The queue now has: " + iPhone.getSize() + " in it.");
		temp = iPhone.peek();
		System.out.println("The first person to get a phone will be: " +
				temp.getName());
		iPhone.printQ();
		int index = iPhone.getSize();
		Person newPhone;
		for (int i = 0; i < index; i++ ) {
			newPhone = iPhone.getOff();
			System.out.println("Oh look!  " + newPhone.getName() + " just got a phone!");

		}
		System.out.println("size = " + iPhone.getSize());
	}

}
		
