import java.lang.*;
import java.util.*;

class Marks{

public static void main(String args[])
{

int subjects,number;
Scanner in =new Scanner(System.in);

System.out.println("Enter the number of subjects whose grades you want to calculate");
subjects=in.nextInt();
char grades[]=new char[subjects];


for(number=0;number<subjects;number++)
{
int cie,see;
while(true)
{
System.out.println("Enter your CIE marks");
 cie = in.nextInt();
 if(cie<0 || cie>50)
	System.out.println("Entered marks is invalid");
 else
   break;
}

while(true)
{
System.out.println("Enter your SEE marks");
 see = in.nextInt();
 if(see<0 || see>100)
	System.out.println("Entered marks is invalid");
 else
   break;

}
	
int total=cie+(see/2);
if(total>=90)
	grades[number]='S';
else if(total<90 && total >=80)
	grades[number]='A';
else if(total<80 && total >=70)
	grades[number]='B';
else if(total<70 && total >=60)
	grades[number]='C';
else if(total<60 && total >=50)
	grades[number]='D';
else if(total<50 && total >=40)
	grades[number]='E';
else if(total<40)
	grades[number]='F';





}
for(int k=0;k<number;k++)
 System.out.println("The grade in subject "+(k+1)+" "+grades[k]);
}
}
