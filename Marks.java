import java.lang.*;
import java.util.*;

class Marks{

public static void main(String args[])
{

Scanner in =new Scanner(System.in);

int cie,see;
while(true)
{
System.out.println("Enter your CIE marks");
 cie = in.nextInt();
 if(cie<0 || cie>=50)
	System.out.println("Entered marks is invalid");
 else
   break;
}

while(true)
{
System.out.println("Enter your SEE marks");
 see = in.nextInt();
 if(see<0 || see>=100)
	System.out.println("Entered marks is invalid");
 else
   break;

}
System.out.println("The entered marks \n CIE: "+cie+"\n SEE: "+see); 	
int total=cie+(see/2);
if(total>=90)
	System.out.println("Grade obtained in this subject is S");
else if(total<90 && total >=80)
	System.out.println("Grade obtained in this subject is A");
else if(total<80 && total >=70)
	System.out.println("Grade obtained in this subject is B");
else if(total<70 && total >=60)
	System.out.println("Grade obtained in this subject is C");
else if(total<60 && total >=50)
	System.out.println("Grade obtained in this subject is D");
else if(total<50 && total >=40)
	System.out.println("Grade obtained in this subject is E");
else if(total<40)
	System.out.println("Grade obtained in this subject is F");

}
}