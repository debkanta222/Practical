package JAVA_IO;
import java.io.*;
class Student implements Serializable{
int id;
String name;
//transient
int fees;
Student(int id,String name,int fees){
	this.id=id;
	this.name=name;
	this.fees=fees;
}}
public class ObjectOutput {
	public static void main(String[] args) {
		try {
			Student s=new Student(10,"dev",10000);
			FileOutputStream fout=new FileOutputStream("D:\\test.txt");
			ObjectOutputStream oout=new ObjectOutputStream(fout);
			oout.writeObject(s);
			oout.close();
			System.out.println("done");
		}
catch(Exception e) {
	e.printStackTrace();
}
	}

}
