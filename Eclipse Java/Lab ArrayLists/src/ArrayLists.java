import java.util.*;
public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names);
		names.add("Alice");
		names.add("Bob");
		names.add("Connie");
		names.add("David");
		names.add("Edward");
		names.add("Fran");
		names.add("Gomez");
		names.add("Harry");
		System.out.println(names);
		int size = names.size();
		for (int i = 0; i< size; i++) {
			String name = names.get(i);
			String first = names.get(names.size()-1);
			String last = names.get(names.size()-8);
			System.out.println(first + " "+ last);
			break;
		}
		
	}

}
