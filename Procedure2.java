package ThreadCreation;
//Using Runnable Interface
public class Procedure2 implements Runnable{
	public void run() {
		System.out.println(" running");
	}
	public static void main(String[] args) {
		Procedure2 p2=new Procedure2();
		Thread t=new Thread(p2);
		t.start();

	}

}
