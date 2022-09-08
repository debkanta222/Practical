package Activity;

public class Vehicle {
void running() {
	System.out.println(" running mode on");
}
}
class Car extends Vehicle{
	void run() {
		System.out.println(" car is running");		
	}}
	class Bike1 extends Car{
		void speed() {
			System.out.println(" speed id very fast");
		}
		public static void main(String[] args) {
			
		Bike1 b1=new Bike1();
		b1.running();
		b1.run();
		b1.speed();
	}}
