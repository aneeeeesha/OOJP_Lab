import java.lang.*;

class Dooper{
    int a=20,b,c,d;
    Dooper(int a)
    {this.a=a;
        System.out.println("Entered the Dooper constructor");

    }
}
class Nooper extends Dooper{

Nooper(){
    super(50);
    System.out.println("Entered the Nooper constructor");
}
public Nooper(int a,int b,int c,int d)
{
    this.a=a;
    this.b=b;
    this.c=c;
    this.d=d;
}



}
class Sooper {

public static void main(String args[])
{
    Nooper chid=new Nooper();
   
    System.out.println("The value of int is "+chid.a);
}



}

