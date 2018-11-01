import java.util.Scanner;

public class DtoB {

public static void main(String[] args) {

    int user_Input;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a decimal to convert to binary: ");
    user_Input = scan.nextInt();
    conversion(user_Input);

}

public static void conversion(int decimal) {
    if (decimal > 0) {
        conversion(decimal / 2);
        System.out.print(decimal % 2);
    }
}

}