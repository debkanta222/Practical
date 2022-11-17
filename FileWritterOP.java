package JAVA_IO;  
import java.io.FileWriter;  
public class FileWritterOP  {  
    public static void main(String args[]){    
         try{    
           FileWriter f=new FileWriter("D:\\testout.txt");    
           f.write("Welcome to coding");    
           f.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("DONE");    
     }    
}  
