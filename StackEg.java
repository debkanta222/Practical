package Collections;
import java.util.*;

public class StackEg {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.err.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.size());
		System.out.println(st.search(30));
		System.out.println(st.isEmpty());//returns True/False
		System.out.println(st.get(2));

	}

}
