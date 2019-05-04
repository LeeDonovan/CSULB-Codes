
public class Sorter
{

	static int counter = 0;
   public static void sort(int[] a)
   {
      if (a.length <= 1) { return; }
      int[] first = new int[a.length / 2];
      int[] second = new int[a.length - first.length];

      for (int i = 0; i < first.length; i++)
      {
         first[i] = a[i];
      }
      for (int i = 0; i < second.length; i++)
      {
         second[i] = a[first.length + i];
      }
      sort(first);
      sort(second);
      merge(first, second, a);
   }

   private static void merge(int[] first, int[] second, int[] a)
   {
      int iFirst = 0; 
      int iSecond = 0;
      int j = 0; 


      while (iFirst < first.length && iSecond < second.length)
      {
         if (first[iFirst] < second[iSecond])
         {
            a[j] = first[iFirst];
            iFirst++;
         }
         else
         {
            a[j] = second[iSecond];
            iSecond++;
         }
         j++;
         counter++;
      }


      while (iFirst < first.length)
      {
         a[j] = first[iFirst];
         iFirst++; j++;
      }

      while (iSecond < second.length)
      {
         a[j] = second[iSecond];
         iSecond++; j++;
      }
   }


public static void resetCounter() 
{
	counter =0;
}
public static int getCounter() 
{
	return counter;
}

}