import java.util.Scanner;
class complex {
double real, img;
//default constructor(required for creating result object)
complex() {
real = 0;
img = 0;
}
//parameterized constructor
complex(double r, double i) {
real = r;
img = i;
}
//add method
complex add(complex c2) {
complex result = new complex();
result.real = real + c2.real;
result.img = img + c2.img;
return result;
}
//subtract method
complex sub(complex c2) {
complex result = new complex();
result.real = real - c2.real;
result.img = img - c2.img;
return result;
}
//multiply method
complex mul(complex c2) {
complex result = new complex();
result.real = (real * c2.real) - (img * c2.img);
result.img = (real * c2.img) + (img * c2.real);
return result;
}
//display method
void display() {
System.out.println(real + "+" + img + "i");
}
}
//to display
public class complexMain {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
//input 1st
System.out.println("Enter real and imaginary part of first no.:");
double r1 = sc.nextDouble();
double i1 = sc.nextDouble();
complex c1 = new complex(r1, i1);
//input 2nd
System.out.println("Enter real and imaginary part of second no.:");
double r2 = sc.nextDouble();
double i2 = sc.nextDouble();
complex c2 = new complex(r2, i2);
//use 1st object(c1) to call the operations and pass the 2nd object(c2) as the parameter
//---perform operation---
complex sum = c1.add(c2);
complex diff = c1.sub(c2);
complex prod = c1.mul(c2);
//----display----
System.out.print("Sum = ");
sum.display();
System.out.print("Diffrents = ");
diff.display();
System.out.print("product = ");
prod.display();
}
}

