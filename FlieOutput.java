package JAVA_IO;
import java.io.FileOutputStream;  
public class FlieOutput {  
    public static void main(String args[]){    
           try{    
             FileOutputStream f=new FileOutputStream("D:\\test.pdf");    
            // f.write(65);  
             String s="I am Good";
             byte b[]=s.getBytes();
             f.write(b);
            // f.close();    
             System.out.println("done");    
            }catch(Exception e)
           {System.out.println(e);}    
      }    
}  