package Activity;

public class Vehicle2 {
		void running() {
			System.out.println(" running mode on");
		}
		}
		class Car1 extends Vehicle2{
			void run() {
				System.out.println(" car is running");		
			}}
			class Bike2 extends Vehicle2{
				void speed() {
					System.out.println(" speed id very fast");
				}
				public static void main(String[] args) {
					
				Bike2 b1=new Bike2();
				b1.running();
				b1.speed();
				Car1 c=new Car1();
				c.run();
				c.running();
			}}

