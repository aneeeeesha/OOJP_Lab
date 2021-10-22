import java.util.*;

class OddorEven{
public static void main(String args[]){

int num=10;

Scanner in=new Scanner(System.in);
System.out.println("Enter an integer that you want to check is odd or even :");
num=in.nextInt();
if(num%2==0)
System.out.println("The entered number,"+num+ " is even.");
else
System.out.println("The entered number,"+num+ " is odd.");

}
}
