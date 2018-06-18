import java.util.Scanner;
import java.lang.String;

abstract class Animals {

public void speak(){
System.out.println("speak is a non-abstract method");
}

abstract void eat(String colour,String breed,String name);
}

class Lion extends Animals{
public void eat()
{
System.out.println("the colour is"+colour+"of breed"+breed+"having name"+name+"eat other animals");
}


public static void main(String[] args);{
String colour=colour;
String breed=breed;
String name=name;


Scanner sc;
sc=new Scanner(System.in);
System.out.println("enter colour,breed,name of animal");
String colour=sc.next();
String breed=sc.next();
String name=sc.next();



Lion obj=new Lion();
obj.eat();
}
}