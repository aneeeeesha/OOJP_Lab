import java.lang.*;
import java.util.*;
class Book{
    public static void main(String args[]){
    
        System.out.println("Enter the number of entries that you want to enter");
        Scanner neo=new Scanner(System.in);
        int n,i=0;
        n=neo.nextInt();
        while(i!=n)
            {Books book1=new Books();
            i++;
            System.out.println(book1);
            }
        }
    }
    class Books{
        String name;
        String author;
        int price;
        int no_pages;
            Books(){
            int a=0;
            
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the name of the book");
            name=input.nextLine();
            System.out.println("Enter the author of the book");
            author=input.nextLine();
            System.out.println("Enter the price of the book");
            price=input.nextInt();
            System.out.println("Enter the number of pages in the book");
            no_pages=input.nextInt();
    
       
                    }  
    public String toString(){ 
      return "Name:"+name+"\nAuthor:"+author+" \nPrice:"+price+" \nNumber of pages:"+no_pages;
    
    }


}


