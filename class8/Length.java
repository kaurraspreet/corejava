import java.util.Scanner;
import java.lang.String;
class Length{
	public static void main(String[] args)
{
	Scanner sc;
	sc=new Scanner(System.in);
	System.out.println("please enter the desired string");
	 String str= sc.nextLine();
	 System.out.println("Length of string is :"+str.length());
	 System.out.println("Length of String without spaces: "+str.replace(" ", "").length());
}
}