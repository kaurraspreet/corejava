class Palindrome{

public static void main(String[] args){
 
  int n=1228;


  int original=n;
  int reverse=0;

  int remainder;

while(original > 0){

remainder = original % 10;
reverse = reverse*10 + remainder;
original= original/10;

}
if (reverse==n){
System.out.println(" the number "+reverse+" is palindrome");
}
else{

System.out.println(" the number "+reverse+" is not palindrome");
}
 }
}