import java.lang.*;
import java.util.*;
abstract class Shape{

int a;
int b;
Shape(int a,int b){
this.a=a;
this.b=b;}
abstract int printArea();

}

class Rectangle extends Shape{
Rectangle(int a,int b)
{
super(a,b);
}
int printArea(){
System.out.println("Enered   ");
return 0;
}

}

class AbstractShape{


public static void main(String args[])
{
System.out.println("Enter the dimensions of the shape");
Scanner in = new Scanner(System.in);
int d1=in.nextInt();
int d2=in.nextInt();

Rectangle r=new Rectangle(d1,d2);
r.printArea();


}

}
