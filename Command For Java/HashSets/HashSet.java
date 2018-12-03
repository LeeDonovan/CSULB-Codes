/**Tea LAUREY #017056583
   Donovan LEE #016741645
     December 3, 2018
     Purpose: This program allows the user to create sets of elements
     		  It also generates the union, intersection and difference of two given sets
     Inputs: Elements of the generated sets
     Output: The union, intersection and difference of two given sets
*/

import java.util.Iterator;
import java.util.*;

/**
   This class implements a hash set using separate chaining.
*/
public class HashSet
{
   private Node[] buckets;
   private int currentSize;

   /**
      Constructs a hash table.
      @param bucketsLength the length of the buckets array
   */
   public HashSet(int bucketsLength)
   {
      buckets = new Node[bucketsLength];
      currentSize = 0;
   }

   
   /**
      Tests for set membership.
      @param x an object
      @return true if x is an element of this set
   */
   public boolean contains(Object x)
   {
      int h = x.hashCode();
      if (h < 0) { h = -h; }
      h = h % buckets.length;
      
      Node current = buckets[h];
      while (current != null)
      {
         if (current.data.equals(x)) { return true; }
         current = current.next;
      }
      return false;
   }

   /**
      Adds an element to this set.
      @param x an object
      @return true if x is a new object, false if x was
      already in the set
   */
   public boolean add(Object x)
   {
      int h = x.hashCode();
      if (h < 0) { h = -h; }
      h = h % buckets.length;
      
      Node current = buckets[h];
      while (current != null)
      {
         if (current.data.equals(x)) { return false; }
            // Already in the set
         current = current.next;
      }
      Node newNode = new Node();
      newNode.data = x;
      newNode.next = buckets[h];
      buckets[h] = newNode;
      currentSize++;
      return true;
   }

   /**
      Removes an object from this set.
      @param x an object
      @return true if x was removed from this set, false
      if x was not an element of this set
   */
   public boolean remove(Object x)
   {
      int h = x.hashCode();
      if (h < 0) { h = -h; }
      h = h % buckets.length;
      
      Node current = buckets[h];
      Node previous = null;
      while (current != null)
      {
         if (current.data.equals(x)) 
         {
            if (previous == null) { buckets[h] = current.next; }
            else { previous.next = current.next; }
            currentSize--;
            return true;
         }
         previous = current;
         current = current.next;
      }
      return false;
   }

   /**
   Produce a set that is the union of two given sets.
   @param x a HashSet, y another HashSet
   @return  HashSet that is the union of the HashSets
   x and y
    */
   public HashSet union(HashSet x, HashSet y)
   {
	  Iterator Xiterator = x.iterator(); //create iterators for both sets
	  Iterator Yiterator = y.iterator();
	  HashSet unionSet = new HashSet(50); //create the union set
	  
	  while(Xiterator.hasNext()) //repeat for all the elements of the set x
      {
         unionSet.add(Xiterator.next()); //add each element of set x to the union set
      }
	  
	  while(Yiterator.hasNext()) //repeat for all the elements of the set y
      {
         unionSet.add(Yiterator.next()); //add each element of the set y to the union set
      }
      return unionSet; //return the union set
   }

   /**
   Produce a set that is the intersection of two given sets.
   @param x a HashSet, y another HashSet
   @return  HashSet that is the intersection of the HashSets
   x and y
    */
   public HashSet intersect(HashSet x, HashSet y)
   {
      Iterator Xiterator = x.iterator(); //create iterator for both sets
      Iterator Yiterator = y.iterator();
      HashSet intersectSet = new HashSet(50); //create the intersection set
      
      
      while(Xiterator.hasNext()) //repeat for all the elements of the set x
      {
    	  Object i = Xiterator.next();
    	  
    	  if (y.contains(i)) //if the object i of the set x is contained in set y
    		  {
    			  intersectSet.add(i); //add object i to the intersection set
    		  }
      }
      
      return intersectSet; //return the intersection set
   }
 

   /**
   Produce a set that is the difference of two given sets.
   @param x a HashSet, y another HashSet
   @return  HashSet that is the difference between the
   HashSets x and y
    */
   public HashSet difference(HashSet x, HashSet y)
   {
	      Iterator Setxiterator = x.iterator(); //create iterators for both sets
	      Iterator Setyiterator = y.iterator();
	      HashSet differenceSet = new HashSet(50); //create the difference set
	      
	      while(Setxiterator.hasNext()) //repeat for all the elements of the set x
	      {
	    	  Object i = Setxiterator.next();
	    	  
	    	  if (!y.contains(i)) //if the object i of the set x is not contained in y
	    		  {
	    			  differenceSet.add(i); //add object i to the difference set
	         }
	      }

	      while(Setyiterator.hasNext()) //repeat for all the elements of the set y
	      {
	    	  Object i = Setyiterator.next();
	    	  
	    	  if (!x.contains(i)) //if the object i of the set y is not contained in x
	    		  {
	    			  differenceSet.add(i); //add object i to the difference set
	         }
	      }
	      
	      return differenceSet; //return the difference set
	   }

   /**
      Returns an iterator that traverses the elements of this set.
      @return a hash set iterator
   */
   public Iterator iterator()
   {
      return new HashSetIterator();
   }

   /**
      Gets the number of elements in this set.
      @return the number of elements
   */
   public int size()
   {
      return currentSize;
   }

   class Node
   {
      public Object data;
      public Node next;
   }

   class HashSetIterator implements Iterator
   {
      private int bucketIndex;
      private Node current;

      /**
         Constructs a hash set iterator that points to the
         first element of the hash set.
      */
      public HashSetIterator()
      {
         current = null;
         bucketIndex = -1;
      }
      
      public boolean hasNext()
      {
         if (current != null && current.next != null) { return true; }
         for (int b = bucketIndex + 1; b < buckets.length; b++)
         {
            if (buckets[b] != null) { return true; }
         }
         return false;
      }
       
      public Object next()
      {
         if (current != null && current.next != null) 
         {            
            current = current.next; // Move to next element in bucket
         }
         else // Move to next bucket
         {            
            do
            {
               bucketIndex++;
               if (bucketIndex == buckets.length) 
               {
                  throw new NoSuchElementException();
               }
               current = buckets[bucketIndex];
            }
            while (current == null);            
         }
         return current.data;
      }

      public void remove()
      {
         throw new UnsupportedOperationException();
      }
   }
   

}