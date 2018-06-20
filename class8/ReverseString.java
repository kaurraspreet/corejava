import java.util.Scanner;

class ReverseString{
 public static void main(String[] args) {
	Scanner sc;
	System.out.println("please enter a string -");
	sc= new Scanner(System.in); 
	String s=sc.nextLine();
	StringBuffer sbr=new StringBuffer(s);
	sbr.reverse();
	System.out.println("the reverse of the string is : ");
	System.out.println(sbr);

}

}