import java.util.Scanner;
class Rectangle{

int length,breadth;
public int CalculateArea(int l,int b){

return l*b;
}
public static void main(String[] args){
Scanner sc;
sc=new Scanner(System.in);
System.out.println("enter length and breadth");
int length= sc.nextInt();
int breadth= sc.nextInt();
Rectangle r1=new Rectangle();
int a=r1.CalculateArea(length,breadth);
System.out.println( "the area of rectangle is "+a);
}
}