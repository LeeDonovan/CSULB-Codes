import java.util.Iterator;

/**
   This program demonstrates the hash set class.
*/
public class HashSetDemo2
{
   public static void main(String[] args)
   {
      HashSet names = new HashSet(101); 

      names.add("Harry");
      names.add("Sue");
      names.add("Nina");
      names.add("Susannah");
      names.add("Larry");
      names.add("Eve");
      names.add("Sarah");
      names.add("Adam");
      names.add("Tony");
      names.add("Katherine");
      names.add("Juliet");
      names.add("Romeo");
      
      HashSet names2 = new HashSet(101);
      names2.add("Harry");
      names2.add("Sue");
      names2.add("Nina");
      names2.add("Susannah");
      names2.add("Linus");
      names2.add("Sam");
      
      HashSet names3 = new HashSet(101);
      names3.add("Harrison");
      names3.add("Sue");
      names3.add("Mimi");
      names3.add("Susannah");
      names3.add("Linus");
      names3.add("Sam");
      
      System.out.println("testing intersect");
      HashSet namesd = names.intersect(names2,names3);
      Iterator iter = namesd.iterator();
      while (iter.hasNext())
      {
         System.out.println(iter.next());
      }
   }
}

