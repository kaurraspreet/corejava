import java.util.Scanner;
import java.util.*;

class Rectangle{



public static double CalculateArea(double l,double w);
{ double area;
  area=l*w;
  return area;
}

public static void main(String[] args){
double length,breadth, area;
Scanner ar;
ar=new Scanner(System.in);
length=ar.nextInt();
breadth= ar.nextInt();

area=CalculateArea(length,breadth);
System.out.println("Area of rectangle is:" +area);
}

}
