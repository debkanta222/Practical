package Collections;

import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList <String>al=new ArrayList<String>(15);
		al.add("dev0");
		al.add("dev1");
		al.add("dev2");
		al.add("dev3");
		al.add(3,"dev4");
		al.add("dev5");
		al.add(0,"dev6");
		al.add("dev7");
System.err.println(al);
System.out.println("size : "+al.size());
System.out.println("index : "+al.get(4));
al.remove(5);
al.set(6, "new");
Collections.sort(al);
System.err.println(al);
System.out.println("size : "+al.size());
System.out.println(al.isEmpty());
al.ensureCapacity(20);
	}

}
