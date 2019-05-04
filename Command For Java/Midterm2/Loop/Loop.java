import java.util.*;

public class Loop{
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
    int nums = 0;
    while(nums < 1){
        nums++;
        int[] a = ArrayUtil.randomIntArray(10*nums, 10);
	    Sorter.resetCounter();
        Sorter.sort(a);
        System.out.println(Arrays.toString(a));
	    System.out.println("Array size: " + 10000*nums + " Run through: " + Sorter.getCounter());

    }
 
}
}