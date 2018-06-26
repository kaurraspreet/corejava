import java.io.*;
import java.util.Arrays;

class SortArray{
public static<G> void printArray(G[] arr){
for(G r: arr)
System.out.printf("%s",r);
System.out.println();
}
public static void main(String[] args){

String[] names = {"raspreet", "shalu", "aalia"};
Arrays.sort(names);
System.out.println(Arrays.toString(names));

double[] lengths = {898.0, 260.5, 330.0, 9.0, 0.3};
Arrays.sort(lengths);
System.out.println(Arrays.toString(lengths));

Integer[] numbers = {673,763,178,246,755};
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));
}
}