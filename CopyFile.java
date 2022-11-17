package JAVA_IO;
import java.io.FileOutputStream;
import java.io.FileInputStream; 
public class CopyFile {
	public static void main(String[] args) {
	try {
		byte array[]=new byte[1024];
		  FileInputStream fin=new FileInputStream("D:\\test.txt");  
		  FileOutputStream fout=new FileOutputStream("E:\\newTest.txt"); 
		  int i;
	        while((fin.read(array))>0) {
	        	fout.write(array);       	
	}
	        System.out.println("done");
	}
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
}
}