public class Accrayc{
    public static int[] randomIntArray(int length, int n)
   {  
    int[] a = new int[length];      
    for (int i = 0; i < a.length; i++)
    {
       a[i] = (int) (Math.random() * n);
       System.out.println(a[i]);
    }
}
    public static void swap(int[] a, int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
}
    

