package ThreadCreation;
//by extending Thread class 
public class Procedure1 extends Thread {
public void run() {
	System.out.println(" running");
}}
 class ProcedureX extends Thread {
public void run() {
	System.out.println(" running");
}
	public static void main(String[] args) {
		Procedure1 p=new Procedure1();
		ProcedureX p2=new ProcedureX();
		System.out.println(p.getState());//before starting the thread
		System.out.println(p2.getState());//before starting the thread
		p.start();
		p2.start();
		System.out.println(p.getState());//after starting the thread
		System.out.println(p2.getState());//after starting the thread

	}

}
