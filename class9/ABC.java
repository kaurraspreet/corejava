import java.io.*;
class ABC{
public static void main(String[] args) throws IOException
{
 File f=new File("C:\\Users\\dell\\Desktop\\training\\class9\\ABC.txt"); 
 FileInputStream fis=new FileInputStream(f);
int r;
while((r=fis.read())!= -1){
System.out.print((char)r);
}
}	

}