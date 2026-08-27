import java.util.Scanner;
public class pp1contd {
    public static void main(String[] args){
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      if(n>=0){
        System.out.println("Positive integar");
      }
      if(n%2==0){
        System.out.println("Even");
      }
      else{
        System.out.println("Odd");
      }


    }
}
