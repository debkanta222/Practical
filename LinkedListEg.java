package Collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg {
	public static void main(String[] args) {
		LinkedList <String>ll=new LinkedList<String>();
		ll.add("dev0");
		ll.add("dev1");
		ll.add("dev2");
		ll.add("dev3");
		ll.add("dev4");
		//System.err.println(ll);
		LinkedList <String>ll2=new LinkedList<String>();
		ll2.add("dev5");
		ll2.add("dev6");
		ll2.add("dev7");
		ll2.add("dev8");
	//	ll.addAll(ll2);
		ll.addAll(0, ll2);
	//	System.out.println(ll);
		ll.addFirst("dev0000");
		ll.addLast("dev111111");
		ll.remove("dev7");
		ll.remove(4);
		ll.remove(ll2);
		ll.removeFirstOccurrence("dev3");
		ll.removeLastOccurrence("dev3");
		System.out.println(ll);
		//ll.clear();
	//	Iterator i=ll.descendingIterator();
		Iterator<String> i1=ll.iterator();
		Collections.reverse(ll); 
		while(i1.hasNext()) {
			System.out.print(i1.next()+" ");
			
		}
	}
}
