import java.util.Scanner;

public class pp2 {
    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);
         int x;
         System.out.println("Enter the year:");
         x=a.nextInt();
         if(x%400==0){
            System.out.println("it's a leap year");
         }
         else if(x%4==0 &&x%100!=0){
            System.out.println("it's a leap year");
         }
         else{
            System.out.println("its not a leap year");
         }
    }
    

}
 