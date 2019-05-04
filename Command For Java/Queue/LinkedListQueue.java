import java.util.*;
import java.lang.Iterable;


public class LinkedListQueue {
	private LinkedList<Person> ListQueue;

	public LinkedListQueue() {
		ListQueue = new LinkedList<Person>();
		
	}
	public void add2Queue(Person x){
		ListQueue.add(x);
	}
	public Person peek(){
		return ListQueue.getFirst();
	}
	public int getSize(){
		return ListQueue.size();
	}
	public Person getOff(){
		return ListQueue.removeFirst();
		
	}
	public void printQ(){//toString() function
		Person inQ;
		for(int i = 0; i < ListQueue.size();i++){
			inQ = ListQueue.get(i);
			System.out.println("Name = "+ inQ.getName());
		}
		

	}
	

	
}
	

