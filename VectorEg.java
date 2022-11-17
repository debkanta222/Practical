package Collections;
import java.util.Vector;

public class VectorEg {

	public static void main(String[] args) {
		Vector <String>vc=new Vector<String>(15);
		vc.add("dev0");
		vc.add("dev1");
		vc.add("dev2");
		vc.add("dev3");
		vc.add(0,"dev4");
		System.err.println(vc);
		System.out.println("size : "+vc.size());
		System.out.println("capacity : "+vc.capacity());
		vc.addElement("dev6");
		System.err.println(vc);
		System.out.println("size : "+vc.size());
		System.out.println("capacity : "+vc.capacity());
		System.out.println("index : "+vc.get(4));
		
		if(vc.contains("dev0")) {
			System.out.println("present");
		}
		else
			System.out.println("not present");
	}
}
