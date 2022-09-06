package Activity;

public class StaticVariable {
	int roll;
	String name;
	float fee;
	static String college="ABC";
	StaticVariable(int roll, String name, float fee){
		this.roll=roll;
		this.name= name;
		this.fee=fee;
	}
	void show() {
		System.out.println(roll+" "+name+" "+fee+ " "+college);
	}
public class StaticVariable1{
	public static void main(String[] args) {
		StaticVariable s1=new StaticVariable(100,"dev",400);
		StaticVariable s2=new StaticVariable(200,"dev",500);
		s1.show();
		s2.show();
	}
}
}
