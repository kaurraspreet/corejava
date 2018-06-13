class Reverse{

public static void main(String[] args){
 
  int n=123;


  int original=n;
  int reverse=0;

  int remainder;

while(original != 0){

remainder = original % 10;
reverse = reverse*10 + remainder;
original= original/10;

}
System.out.println("reverse of the number is" + reverse);
 }
}