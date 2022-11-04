package Multithreading;

class A extends Thread{
	public void run() {
		for(int i=1;i<=6;i++) {
			System.out.println(i);
		}
	}
}
public class ThreadJoin {

	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		A a3=new A();
		a1.start();
		try {
		a2.start();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		a3.start();

	}

}
