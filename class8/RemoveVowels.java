
import java.util.Arrays;
import java.util.List;
 
class RemoveVowels{    
static String remove(String str){
 Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
List<Character> c = Arrays.asList(vowels);
StringBuffer str1 = new StringBuffer(str);
          
for(int i = 0; i < str1.length(); i++){
 if(c.contains(str1.charAt(i))){
   str1.replace(i, i+1, "") ;
   i--;
  }
  }
 return str1.toString();
 }
public static void main(String[] args){
String str = "This is remove String program from a particular Array. ";
System.out.println(remove(str));
}
}