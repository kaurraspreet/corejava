import java.lang.String;
public class Pattern{
 
     public static void main(String []args){
        char temp = 'a';
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
            }
            temp++;
            System.out.println();
        }
     }
}