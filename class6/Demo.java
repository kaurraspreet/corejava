import java.util.Scanner;

class Animal{
String breed;
String colour;
public void speak(){
System.out.println("animals ");
}
Animal(String br,String clr){
breed=br;
colour=clr;
}
}
class dog extends Animal
{
public void speak()
{
System.out.println("dog barking");
System.out.println("the dog is " + breed);
System.out.println("colour is "+colour);
}
dog(String br,String clr)
{
super(br,clr);
}
}

class cat extends Animal
{
public void speak()
{
System.out.println("cat meow meow");
System.out.println("the cat is " + breed);
System.out.println("colour is "+colour);
}
cat(String br,String clr)
{
super(br,clr);
}
}

class Demo{
public static void main(String[] args){
dog d=new dog("retriever", "black");
d.speak();
cat c=new cat("normal", "brown");
c.speak();
}
}