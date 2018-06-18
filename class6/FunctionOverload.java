class FunctionOverload{

public void display(){
System.out.println("null argument");
}
public void display(int i)
{
System.out.println("integer argument called="+i);
}
public void display(float j)
{
System.out.println("float agrument called="+j);
}

public static void main(String[] args)
{
FunctionOverload a1=new FunctionOverload();
a1.display();
a1.display(10);
a1.display(1.0f);
}
}