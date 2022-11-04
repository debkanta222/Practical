package ThreadCreation;
// using Thread class Constructor : Thread(Runnable r, String name)
public class Procedure4 implements Runnable {
	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		Runnable r=new Procedure4 ();
		Thread t=new Thread(r,"dev");
		t.start();

	}

}
