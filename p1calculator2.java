
import java.util.Scanner;

public class p1calculator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer: ");
            int x = scan.nextInt();

        System.out.print("Enter second integer: ");
        int y = scan.nextInt();


            System.out.print("Enter operator (+, -, *, /): ");
        char ch = scan.next().charAt(0);

        if (ch=='+') {

            System.out.println(x + y);

        } else if (ch=='-') {
             System.out.println(x - y);
        } else if (ch == '*') {
            System.out.println(x * y);

              } else if (ch== '/') {
            if (y != 0) {
                System.out.println(x / y);
            } else {

                System.out.println("Cannot divide by zero");
            }
        } else {

            System.out.println("Invalid operator");
        }


        scan.close();
    }
}