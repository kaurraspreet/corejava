import java.lang.String;
class SubString{
	
	 public static void main(String[] args) {
	 	String str="xyz";
       for (int beginIndex = 0; beginIndex < str.length(); beginIndex++) {
         for (int endIndex = beginIndex + 1; endIndex <= str.length(); endIndex++) {
            System.out.println(str.substring(beginIndex, endIndex));
         }
      }
	 }
}