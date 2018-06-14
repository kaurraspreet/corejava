import java.util.Scanner;

 public class ReverseNumber{

public static void main(String[] args){

int n,reverse=0,r,original;

Scanner ab;
ab= new Scanner(System.in);
n=ab.nextInt();
original=n;
while(original != 0){

r=original%10;
reverse=reverse*10+r;
original=original/10;
}
System.out.println(reverse);
}
}