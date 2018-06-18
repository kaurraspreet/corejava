import java.util.Scanner;
import java.lang.String;

class StringNumber{

public static void main(String[] args){


Scanner sc;
sc=new Scanner(System.in);
System.out.println("Enter three string number as input");

String m= sc.next();
String n= sc.next();
String o= sc.next();

int num1=Integer.valueOf(m);
int num2=Integer.valueOf(n);
int num3=Integer.valueOf(o);
int sum=num1+num2+num3;
System.out.println("result is :"+sum);

 if (Integer.valueOf(m) >Integer.valueOf(n) ) { 
          System.out.println("the greatest number is"+m);
        }
        else  { 
            System.out.println("the greatest number is"+n);
        }

}
}
