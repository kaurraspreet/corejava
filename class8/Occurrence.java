import java.lang.String;
import java.util.Scanner;
class Occurrence{

public static void main(String[] args){

Scanner sc;
sc=new Scanner(System.in);
System.out.println(" please enter a string");
String str =sc.nextLine();
System.out.println(" please enter a string which you want to check");
String str1= sc.next();
System.out.println(str.compareTo(str1)<0);



}
}