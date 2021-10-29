import java.lang.*;
import java.util.*;

class Pattern{

public static void main(String args[])
{

Scanner in = new Scanner(System.in);
int n;
int j=0;
int count=0;
n=in.nextInt();
for(int i=1;i<=n;i++)
{ 
  for(j=0;j<i;j++)
  {System.out.print((count)+" ");
count++;}  
System.out.println();
}

}


}