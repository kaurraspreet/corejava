import java.util.Arrays;

public class PrintArr {
 
public static <E> void printArray(E[] ArrayPrint ) {
for (E element : ArrayPrint )
System.out.printf("%s ", element);
System.out.println();
}

public static void main(String args[]) {
  
Integer[] intArray = { 0,7,4,8,9,5,6,2,1};
Double[] dblArray = { 2687.89,56273.67,5667.8,211.0 };
Character[] charArray = {'r','a','s','p','r','e','e','t'};

System.out.println(" integerArray contains:");
printArray(intArray);

System.out.println("\n doubleArray contains:");
printArray(dblArray);
 
System.out.println("\n characterArray contains:");
printArray(charArray);

} 
}