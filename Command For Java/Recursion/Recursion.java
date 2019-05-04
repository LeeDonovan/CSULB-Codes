import java.util.*;
public class Recursion{
    public static int sum(int num){
        int result;
        if (num ==1)
            result = 1;
        else
            result = num + sum(num-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        int userInput = scan.nextInt();
        System.out.println(sum(userInput));
        }
}

