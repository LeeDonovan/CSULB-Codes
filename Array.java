import java.util.ArrayList;

public class Array
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println("Step: 0 The list of names now looks like:\n");
        int size = names.size();
        for(int i = 0; i < size; i++ )
        {
            System.out.println(names.get(i));
        }
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        size = names.size();  
        System.out.println("Step: 1 After performing the original adds");
        System.out.println("Step: 1 The list of names now looks like:");
        for(int i = 0; i < size; i++)
        {
            System.out.println(names.get(i));
        }
        System.out.println("Step 2:\n" + "The names list currently has: "+size);
        for(int i = 0; i < size; i++)
        {
            if(names.get(i) == "Alice")
            {
                names.set(i,"Alice B. Toklas");
            }
        }
        ArrayList<String> names2 = new ArrayList<String>();
        for(int i = 0; i < size; i ++)
        {
            names2.add(names.get(i));
        }
        names.remove(0);
        System.out.println(names);
        System.out.println(names2);
        




    }
}