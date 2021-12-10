import java.lang.*;
import java.util.*;
abstract class Shape{

int a;
int b;
Shape(int a,int b){
this.a=a;
this.b=b;}
abstract void printArea();


Shape(int a){
this.a=a;}

}

class Triangle extends Shape{
Triangle(int a,int b){
super(a,b);

}
void printArea(){
System.out.println("The given triangle's area is as follows : "+(0.5*a*b));
}
}

class Circle extends Shape{
Circle(int a){
super(a);

}

void printArea(){

System.out.println("The area of the circle is :"+(3.14*a*a));
}


}

class Rectangle extends Shape{
Rectangle(int a,int b)
{
super(a,b);
}
void printArea(){
System.out.println("The entered shape's area is : "+(a*b));

}

}

class Abstract_Shape{


public static void main(String args[])
{
int d1,d2;

System.out.println("Enter the shape taht you want to find the area of ");
System.out.println("\nPress 1 for Rectangle \nPress2 for Triangle \n Press 3 for Circle\n");

Scanner in = new Scanner(System.in);
int type=in.nextInt();
System.out.println("Enter the dimensions of the shape");
switch(type){
case 1:
	d1=in.nextInt();
	d2=in.nextInt();
	Rectangle r=new Rectangle(d1,d2);
	r.printArea();
case 2:
	d1=in.nextInt();
	d2=in.nextInt();
	Triangle t=new Triangle(d1,d2);
	t.printArea();
case 3:
	d1=in.nextInt();
	Circle c=new Circle(d1);
	c.printArea();
	

}






}

}
