import java.io.*;
import java.util.*;
import java.lang.*;
public class UniversalTranslator
{
    public static String Klingon(String text) {
		String firstChar = text.substring(0,1);
		String notFirstChar = text.substring(1, text.length());
		String n = "", finish = "";
		if (text.length() > 1){
			n = Klingon(notFirstChar);
			finish = n + firstChar;
		}
		else {
			finish += text;
		}
		return finish;
    }


    public static String Vulcan(String str)
    {
        List<Character> chars = new ArrayList<>();
        String yippe;
        for (char ch : str.toCharArray()) 
        { 
            chars.add(ch); 
        }
        Collections.shuffle(chars);
        yippe = chars.toString();
        String oo= "";
        for(int i = 0; i<chars.size();i++)
        {
            oo = oo + chars.get(i);
        }
        return oo;
    }
    

public static void main(String[] args)
{
    File f = new File("C:\\Users\\Donald\\Desktop\\MasterCoder\\EXCEL-Mentee-Repository\\CECS277\\HW5\\Earth.txt");
    try{
        BufferedReader br = new BufferedReader(new FileReader(f));
        String str;
        str = br.readLine();
        System.out.println(str); 
        System.out.println(Klingon(str));
        //System.out.println(shuffle(str));
        System.out.println(Vulcan(str));

    }
    catch(FileNotFoundException ile)
    {
        System.out.println(ile.getMessage());
        ile.printStackTrace();
    }
    catch(IOException hehe)
    {
        System.out.println(hehe.getMessage());
    }
    
  }

}
