import java.lang.*;
import java.util.*;

class SGPA{
    public static void main(String args[]){
}
}

class details{
int usn;
String name;
int credits[]=new int[6];
int marks[]= new int[6];
double sgpa;

details(){

Scanner input=new Scanner(System.in);
            System.out.println("Enter the name ");
            name=input.nextLine();
            System.out.println("Enter the usn");
            usn=input.nextInt();
            System.out.println("Enter the credits");
            for(int i=0;i<6;i++)
		credits[i]=input.nextInt();
            System.out.println("Enter the marks");
            for(int i=0;i<6;i++)
		marks[i]=input.nextInt();
}

int calculator(marks[],credits[])
{
 sgpa=0;
 
for(int i=0;i<6;i++)
{
sgpa+=marks[i]*credits[i];

}
sgpa/=6;
}
}
    