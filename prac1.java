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
double circlearea(double radius){
    this.radius=radius;
    return Math.PI*radius*radius;
}
double CtoF(double celcius){
    return ((celcius/5)*9)+32;
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
        System.out.println("Enter the circle radius");
        double radius2=input.nextDouble();
        double cirarea=obj1.circlearea(radius2);
        System.out.println("area of circle: "+cirarea);

        System.out.println("Enter celcius");
        double celcius=input.nextDouble();
        double fahrenheit=obj1.CtoF(celcius);
        System.out.println("Celcius to Fahrenheit: "+fahrenheit);



    }
}