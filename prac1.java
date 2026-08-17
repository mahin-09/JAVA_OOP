import java.util.Scanner;
 class math{
double base;
double height;
double area(double base,double height){
    this.base=base;
    this.height=height;
    return 0.5*base*height;
}
double radius;
double volume(double radius){
    this.radius=radius;
    return (4.0/3.0)*Math.PI*radius*radius*radius;
}
  
}



public class prac1
{    public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     math obj1=new math();
     System.out.println("Enter the base of triangle");
     double base=input.nextDouble();
     System.out.println("Enter the Height of triangle");
     double height=input.nextDouble();
     double area=obj1.area(base,height);
     System.out.println("Area of triangle: "+area);
      System.out.println("Enter the radius");
     double radius=input.nextDouble();
     double volume=obj1.volume(radius);
     System.out.println("Volume: "+volume);

    }
}