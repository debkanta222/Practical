package JAVA_IO;

import java.io.FileReader;  
public class  FileReader12 {  
     public static void main(String args[]){    
          try{    
        	  FileReader f=new  FileReader("D:\\newTest.txt");    
        	  int i=0;
              while((i=f.read())!=-1) {
            	  System.out.println(((char)i));           	
              }          
            } catch(Exception e){System.out.println(e);}    
         }    
        }  