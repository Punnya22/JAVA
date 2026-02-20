import java.util.Scanner;
class Geometry{
double area(double r){
return Math.PI * r * r;
}
double area(double length,double breadth){
return length * breadth;
}
double area(double a,double b,double c){
if((a+b<=c)||(a+c<=b)||(b+c<=a)){
System.out.println("invalid Triangle");
return 0.0;
}
double s=(a+b+c)/2;
return Math.sqrt(s*(s-a)*(s-b)*(s-c));
}
}
public class MethodOverloading{
public static void main(String[] args)
{
Scanner sc=new
Scanner(System.in);

Geometry obj=new Geometry();

System.out.println("---methord overloading & area calculation---");

System.out.print("enter radius of the circle : ");
double r = sc.nextDouble();
System.out.println("Area of Circle = " + obj.area(r));

System.out.print("\nEnter length and breadth of the Rectangle: ");
double l = sc.nextDouble();
double b = sc.nextDouble();
System.out.println("Area of Rectangle = " + obj.area(l, b));

System.out.print("\nEnter three sides of the Triangle (a, b, c): ");
double sideA = sc.nextDouble();
double sideB = sc.nextDouble();
double sideC = sc.nextDouble();
System.out.println("Area of Triangle = " + obj.area(sideA, sideB, sideC));

sc.close();
}
}
