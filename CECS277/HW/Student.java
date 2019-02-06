import java.util.*;
import java.lang.Math;
public class Student{
    int idNum;
    int credHrs;
    int numPts;

    public Student(int snum, int creditHrs, int numbPts)
    {
        idNum = snum;
        credHrs = creditHrs;
        numPts = numbPts;
    }
    public int setID(int snum){
        this.idNum = snum;
        return idNum;
    }
    public int setHrs(int creditHrs){
        this.credHrs = creditHrs;
        return credHrs;
    }
    public int setPts(int numbPts){
        this.numPts = numbPts;
        return numPts;
    }
    public double getGPA(){
        double gpa = (numPts/credHrs);
        System.out.printf("%.2f", gpa);
        return gpa;
    }
    public static String lastStudentID(String text) {
		String firstChar = text.substring(0,1);
		String notFirstChar = text.substring(1, text.length());
		String n = "", finish = "";
		if (text.length() > 1){
			n = lastStudentID(notFirstChar);
			finish = n + firstChar;
		}
		else {
			finish += text;
		}
		return finish;
	}
   
}