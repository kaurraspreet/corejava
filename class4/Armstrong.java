import java.util.Scanner;

class Armstrong{

public static void main(String[] args){
int n,r,d=0,original;
Scanner sc;
sc=new Scanner(System.in);
n=sc.nextInt();
original=n;
while(n>0){
 r=n%10;
 d+=r*r*r;
 n=n/10;
}
if(d==original){
System.out.println("the given number is armstrong number");
}
else{
System.out.println("the given number  is not armstrong number");
}

 }

}