import java.lang.String;
interface Animals
{
public void speak();
public void eat();
}

class Cat implements Animals
{
public void speak()
{
System.out.println("cat sounds meww");
}
public void eat()
{
System.out.println("cat eat rat");
}
}


class Dog implements Animals
{
public void speak()
{
System.out.println("dogs sounds woof");
}
public void eat()
{
System.out.println("dog eat biscuit");
}
}
class Test{
public static void main(String[] args){
Animals d=new Cat();
Animals m=new Dog();
d.speak();
d.eat();
m.speak();
m.eat();
}
}