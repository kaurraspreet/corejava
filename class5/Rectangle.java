import java.util.Scanner;
class Rectangle{

int length,breadth;
public int CalculateArea(int length,int breadth){

return length*breadth;
}
public static void main(String[] args){
Scanner sc;
sc=new Scanner(System.in);
System.out.println("enter length and breadth");
int l= sc.nextInt();
int b= sc.nextInt();
Rectangle r1=new Rectangle();
int a=r1.CalculateArea(l,b);
System.out.println(a);
}
}