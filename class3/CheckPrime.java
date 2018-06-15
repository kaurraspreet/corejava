class CheckPrime{

public static void main(String[] args){

int n=7,i,flag=0;
for (i= 2; i <=n; i++) {
if (n % i == 0) {
System.out.println(n+"is not prime number");
flag=1;
break;
}}
if(flag==0){
System.out.println(n+"is prime number");
}
}
}