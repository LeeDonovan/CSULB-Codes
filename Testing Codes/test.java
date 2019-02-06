import java.lang.*;
public class test{

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
    public static void main(String[] args){
        int i = 10;
        String s = String.valueOf(i);
        String rev = reverse(s);
        char first = rev.charAt(0);
        System.out.println(first);
        
    }
}