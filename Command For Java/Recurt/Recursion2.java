
public class Recursion2 {
	public static void convert(int num) {
		int divideNum = num / 2;
		int modNum = num % 2;
		
		if (num != 0) {
			convert(divideNum);
			System.out.print(modNum);
		}
	}
	
	public static void main(String[] args) {
		convert(12);
	}
}
