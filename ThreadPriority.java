package Multithreading;

public class ThreadPriority extends Thread {
@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(800);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}	
public static void main(String[] args) {
	ThreadPriority tp1 =new ThreadPriority();
	ThreadPriority tp2 =new ThreadPriority();
	ThreadPriority tp3 =new ThreadPriority();
	tp1.setPriority(MAX_PRIORITY);
	System.out.println(tp1.getPriority());//10
	System.out.println(Thread.currentThread().getPriority());//BY DEFAULT IS SET TO 5(NORM-PRIORITY)
	tp1.start();
	tp2.start();
	tp3.start();
	tp1.setName("dev");
	System.out.println("thread name : "+tp1.getName());
}
}