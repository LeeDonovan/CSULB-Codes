import java.util.Scanner;
public class Pascal
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter how many rows you would like to print: ");
    int rows = scan.nextInt();
    System.out.println("Pascal Triangle:");
    print(rows);
    scan.close();
  }

  public static void print(int n) 
  {
    for (int i = 0; i < n; i++) 
    {
      for (int k = 0; k < n - i; k++) 
      {
        System.out.print(" "); // print space for triangle like structure
      }
      for (int j = 0; j <= i; j++) 
      {
        System.out.print(pascal(i, j) + " ");
      }
    
      System.out.println();
    }
  }

  public static int pascal(int i, int j) {
    if (j == 0 || j == i) 
    {
      return 1;
    } 
    else 
    {
      return pascal(i - 1, j - 1) + pascal(i - 1, j);
    }
  }
}