package Interface;

public interface InterfaceDemo1 {
void display();
}
class Oooo implements InterfaceDemo1{
	 public void display() {
		System.out.println("example 1 : ");
	}
	 public static void main(String[] args) {
		Oooo oo=new Oooo();
		oo.display();
	}
}
