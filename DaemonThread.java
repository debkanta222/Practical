package Multithreading;

public class DaemonThread extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("deamon thread");
		}
		else {
			System.out.println("normal thread");
			}
	}

	public static void main(String[] args) {
		 DaemonThread dt1= new DaemonThread();
		 DaemonThread dt2= new DaemonThread();
		 DaemonThread dt3= new DaemonThread();
		 dt1.setDaemon(true);
		 dt1.start();
		 dt2.start();
		 try {
		 dt2.setDaemon(true);//throws IllegalThreadStateException as after starting a thread we cant use setDaemon() method.
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 dt3.start();
	}



}
