import java.util.Scanner;


 class CheckArray{



public static void main(String[] args){
int[] temp={1,4,6,7,8,9,10};
int p;
Scanner op;
op=new Scanner(System.in);
p=op.nextInt();

boolean found=false;

for(int r:temp){
if(r==p){

found=true;
break;
}
}
if(found){
System.out.println("number is present in array");
}
else{
System.out.println("number is not present in array");
}





}

}
