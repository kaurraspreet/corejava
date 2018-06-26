import java.util.*;  
import java.io.*; 

 class Student{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;   
}  
}

 


class AgeComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  


class NameComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
return s1.name.compareTo(s2.name);  
}  
}  

 class SortList{ 
public static void main(String args[]){  
  
ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student(6316065,"Raspreet",20));  
al.add(new Student(6316074,"Shalu",19));  
al.add(new Student(6316062,"Rajni",21));
al.add(new Student(6316055,"Priyanka",23));
al.add(new Student(6316056,"Purnima",18));
al.add(new Student(6316049,"Monika",22));  
  
System.out.println("Sort by name:--  ");  
  
Collections.sort(al,new NameComparator());  
for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
System.out.println("sort by age:-  ");  
  
Collections.sort(al,new AgeComparator());  
for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
}  
}  