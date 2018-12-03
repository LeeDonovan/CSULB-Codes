import java.util.*;

public class HashSetTester{
    
    public static void main(String[] args)
    {
   	  /**
      Create the two HasSets set1 and set2
 	   */
        HashSet set1 = new HashSet(16);
        set1.add("India"); 
        set1.add("South Africa"); 
        set1.add("India");
        set1.add("Australia"); 
        set1.add("America");
        HashSet set2 = new HashSet(16);
        set2.add("America");
        set2.add("Mexico");
        set2.add("Australia");
        set2.add("Germany");
        

        /**
        Print both sets to the user using iterators
         */
        System.out.println("Set 1: ");
        Iterator firstset = set1.iterator();
        while (firstset.hasNext()){
            System.out.println(firstset.next());
        }
        System.out.println("\n");
        System.out.println("Set 2: ");
        Iterator secondset = set2.iterator();
        while (secondset.hasNext()){
            System.out.println(secondset.next());
        }
        System.out.println("\n");
        
        
        /**
        Test the union method
          print the expected output
          create the set that will become the union of set1 and set2
          print each element of the union set using an iterator
         */
        System.out.println("Union of set 1 and 2:"); 
        System.out.println("Expected set should contain : India, Australia, South Africa, America, Mexico, Germany");
        HashSet union = new HashSet(50);
        Iterator UnionIterator = union.union(set1,set2).iterator();
        while (UnionIterator.hasNext()){
            System.out.println(UnionIterator.next());
        }
        System.out.println("\n");
        
        
        /**
        Test the intersection method
          print the expected output
          create the set that will become the intersection of set1 and set2
          print each element of the intersection set using an iterator
         */
        System.out.println("Intersection of set 1 and 2:");
        System.out.println("Expected set should contain : Australia, America");
        HashSet inters = new HashSet(50);
        Iterator IntersIterator = inters.intersect(set1,set2).iterator();
        while (IntersIterator.hasNext()){
            System.out.println(IntersIterator.next());
        }
        System.out.println("\n");
        
        
        /**
        Test the difference method
          print the expected output
          create the set that will become the difference of set1 and set2
          print each element of the difference set using an iterator
         */
        System.out.println("Difference between set 1 and 2:");
        System.out.println("Expected set should contain : India, South Africa, Mexico, Germany");
        HashSet Difference = new HashSet(50);
        Iterator DifferenceIterator = Difference.difference(set1,set2).iterator();
        while (DifferenceIterator.hasNext()){
            System.out.println(DifferenceIterator.next());
        }
    }
}