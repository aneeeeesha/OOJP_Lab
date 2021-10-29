import java.lang.*;
import java.util.*;

class Prime_number{

public static void main(String args[])
{
Scanner in = new Scanner(System.in);

System.out.println("Enter the two numbers betweeen which you want to find the prime numbers");
int a,b;
a=in.nextInt();
b=in.nextInt();

for(int j=a;j<=b;j++)
{
for(int i=0;i<(int)Math.sqrt(j);i++)
   if(j%i==0)
	break;
   else
	System.out.println(j+" ");

}

}
}