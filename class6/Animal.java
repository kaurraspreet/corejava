import java.util.Scanner;

class Animal{


 void speak()
{
System.out.println("animals");
}
}

class  Dog extends Animal{
 void speak(){

System.out.println( "the dog of breed"+breed+"has colour"+colour);
}
}

class Cat extends Animal{
 void speak(){

System.out.println("the Cat of breed"+breed+"has colour"+colour);
}
}

class Test{
public static void main(String[] args){

Scanner sc;
sc=new Scanner(System.in);
System.out.println("enter breed and colour of animal");
String breed=b;
String colour=c;
 String b=sc.next();
 String c=sc.next();
Cat c1=new Cat();
Dog d1=new Dog();

d1.speak();
c1.speak();
}


}