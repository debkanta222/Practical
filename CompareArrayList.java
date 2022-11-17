package Collections;

import java.util.ArrayList;
import java.util.List;
public class CompareArrayList {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);al.add(3);al.add(4);
	List<Integer> al2=new ArrayList<>();
	al.add(0);
	al.add(5);al.add(6);al.add(2);
	List<Integer> al3=new ArrayList<>();
	al.add(0);
	al.add(9);al.add(7);al.add(8);
	
	List<String> str=new ArrayList<>();
	str.add("a");str.add("b");str.add("c");str.add("d");
	 List<String> str2=new ArrayList<>();
		str2.add("e");str2.add("i");str2.add("g");str2.add("h");
	  
System.out.println(al.equals(al3));
System.out.println(al.retainAll(al3));
System.out.println(al.containsAll(al3));
System.out.println(al2.removeAll(al3));
System.out.println(al.contains(al));
System.out.println();
System.out.println(str.toString().contentEquals(str2.toString()));
}}
