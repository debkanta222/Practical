package Practice2;

public class NewString {
int roll;
String name,address;
NewString(int roll,String name,String address){
	this.roll=roll;
	this.name=name;
	this.address=address;
}
public String toString() {
	return roll+" "+name+" "+address;
}
	public static void main(String[] args) {
	NewString s1=new NewString(1,"dev","patuli")	;
	NewString s2=new NewString(2,"dev","garia")	;
System.out.println(s1);
System.out.println(s2);
	}

}
