import java.util.Scanner;

class Complex{

int real,imaginary;
public void display(int real,int imaginary)
{
int r=real;
int imag=imaginary;
System.out.println(r+"+"+imag+"i");
}
public static void main(String[] args){
Scanner sc;
sc=new Scanner(System.in);
System.out.println("enter real and imaginary number");
int r1=sc.nextInt();
int img=sc.nextInt();
Complex c1=new Complex();
c1.display(r1,img);
}
}