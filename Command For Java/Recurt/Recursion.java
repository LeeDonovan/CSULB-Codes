
public class Recursion {
	
	public static String reverse(String text) {
		String firstChar = text.substring(0,1);
		String notFirstChar = text.substring(1, text.length());
		String n = "", finish = "";
		if (text.length() > 1){
			n = reverse(notFirstChar);
			finish = n + firstChar;
		}
		else {
			finish += text;
		}
		return finish;
	}
	public static void main(String[] args) {
		String reverse = reverse("Hello!");
		System.out.println(reverse);
	}
}
