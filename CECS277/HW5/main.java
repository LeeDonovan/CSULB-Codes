import java.io.*;
import java.util.*;


public class main{
    public static void main(String[] args) throws InvalidLanguageException
    {
        File f = new File("Earth.txt");
        File f1 = new File("Earth.txt2");
        f.createNewFile();
        System.out.println(f.exists());
        System.out.println(f1.exists());
        EarthText et = new EarthText();
        EarthText et2 = new EarthText();

        try
        {

            et.sendMessage("Earth", "Earth.txt2");
            et2.sendMessage("Earth","Earth.txt");
        }
        catch(InvalidLanguageException e)
        {
            System.out.println(e.getMessage());
        }
    }
}