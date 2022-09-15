package SuperKeyword;

class A{
	int i;
	void method() {
		System.out.println("doing");
	}
}
class B extends A{
	int i;
	void method(int a) {
		super.i=a;
		super.method();
	}
void display() {
	System.out.println("result is : "+super.i);
	}
public class SuperEg1 {
	public static void main(String[] args) {
		B b1=new B();
		b1.method(5);
		b1.display();
	}
		

	}

}
