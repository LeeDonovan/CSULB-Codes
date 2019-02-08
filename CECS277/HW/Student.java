import java.util.*;
import java.lang.Math;
public class Student{
    int idNum;
    int credHrs;
    int numPts;
    int lastStudentID;

    public Student(int snum, int creditHrs, int numbPts, int lsID)
    {
        lastStudentID = lsID;
        idNum = lastStudentID;
        credHrs = creditHrs;
        numPts = numbPts;
    }
    public int setID(int snum){
        this.idNum = snum;
        return idNum;
    }
    public int getID()
    {
        return idNum;
    }
    public int setHrs(int creditHrs){
        this.credHrs = creditHrs;
        return credHrs;
    }
    public int getHrs()
    {
        return credHrs;
    }
    public int setPts(int numbPts){
        this.numPts = numbPts;
        return numPts;
    }
    public int getPts()
    {
        return numPts;
    }
    public float getGPA(){
        float gpa = (numPts/credHrs);
        return gpa;
    }
    public int getLastStudent()
    {
        lastStudentID = lastStudentID + 1;
        return lastStudentID;
    }
    
   
}