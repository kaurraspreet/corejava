import java.io.*;
import java.util.*;

class Date{
public static void main(String[] args){

HashMap <Integer,String> dt= new HashMap<Integer,String> ();
dt.put(01,"one");
dt.put(02,"two");
dt.put(03,"three");
dt.put(04,"four");
dt.put(05,"five");
dt.put(06,"six");
dt.put(07,"seven");
dt.put(8,"eight");
dt.put(9,"nine");
dt.put(10,"ten");
dt.put(11,"eleven");
dt.put(12,"twelve");
dt.put(13,"thirteen");
dt.put(14,"fourteen");
dt.put(15,"fifteen");
dt.put(16,"sixteen");
dt.put(17,"seventeen");
dt.put(18,"eighteen");
dt.put(19,"nineteen");
dt.put(20,"twenty");
dt.put(21,"twenty-one");
dt.put(22,"twenty-two");
dt.put(23,"twenty-three");
dt.put(24,"twenty-four");
dt.put(25,"twenty-five");
dt.put(26,"twenty-six");
dt.put(27,"twenty-seven");
dt.put(28,"twenty-eight");
dt.put(29,"twenty-nine");
dt.put(30,"thirty");
dt.put(31,"thirty-one");

HashMap<Integer,String>  mn=new HashMap<Integer,String> ();
mn.put(01,"january");
mn.put(02,"february");
mn.put(03,"march");
mn.put(04,"april");
mn.put(05,"may");
mn.put(06,"june");
mn.put(07,"july");
mn.put(	8,"august");
mn.put(9,"september");
mn.put(10,"october");
mn.put(11,"november");
mn.put(12,"december");

HashMap<Integer,String>  yr= new HashMap<Integer,String> ();
yr.put(2011,"two thousand and eleven");
yr.put(2012,"two thousand and twelve");
yr.put(2013,"two thousand and thirteen");
yr.put(2014,"two thousand and fourteen");
yr.put(2015,"two thousand and fifteen");
yr.put(2016,"two thousand and sixteen");
yr.put(2017,"two thousand and seventeen");
yr.put(2018,"two thousand and eighteen");
Scanner sc=new Scanner(System.in);
System.out.println("enter the date :");
String date=sc.next();
int str=Integer.parseInt(date.substring(0,2));
int str1=Integer.parseInt(date.substring(3,5));
int str2=Integer.parseInt(date.substring(6));
System.out.println(dt.get(str)+" "+mn.get(str1)+" "+yr.get(str2));
}
}