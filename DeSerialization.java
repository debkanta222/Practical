package JAVA_IO;

import java.io.*;
class Student implements Serializable{
int id;
String name;
 int fees;
Student(int id,String name,int fees){
	this.id=id;
	this.name=name;
	this.fees=fees;
}}
public class DeSerialization {
	public static void main(String[] args) {
		try {
			
		//	FileOutputStream fout=new FileOutputStream("D:\\test.txt");
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\test.txt"));
			Student s=(Student) ois.readObject();
			System.out.println("name : "+s.name+" "+"id is :"+s.id+" "+"fees is : "+s.fees);
			ois.close();
			//System.out.println("done");
		}
catch(Exception e) {
	e.printStackTrace();
}
	}

}
