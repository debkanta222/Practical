package Assignment;
import java.util.*;
public class Circle3 {
	private float redius;
	static float pi = 3.5F;
	
	public Circle3() {
		redius = 1.5F;
	}
	Circle3(float redius) {
		this.redius = redius;
	}
	 Circle3(float redius, float pi) {
		this.redius = redius;
	}
	
	static float calculateCircleArea(float redius) {	
		return pi*redius*redius;	
	}
	static float calculateCircumference(float redius) {
		return 2*pi*redius;
	}
	
	public static void main(String[] args) {
		Circle3 obj=new Circle3();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the radius : ");
		float radius=scan.nextFloat();
		System.out.println("Circle Area is: "+calculateCircleArea(radius));
		System.out.println("Circumference is: "+calculateCircumference(radius));
	}
}

