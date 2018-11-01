/**
   This program demonstrates the merge sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class MergeTestSorter
{  
   public static void main(String[] args)
   {  
	  int nums = 0;
	  while (nums < 9) 
	  {
		  nums++;
		  int[] a = ArrayUtil.randomIntArray(10000*nums, 10000);
	      Sorter.resetCounter();
	      Sorter.sort(a);
	      System.out.println("Array size: " + 10000*nums + " comparisons: " + Sorter.getCounter());
	  }
   }
}