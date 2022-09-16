package Practice;
//1. variables have a type.
int s=50;//variable s is a datatype of int
//Reference have a type.
public class StaticBinding {
public static void main(String[] args) {
	StaticBinding sb;
}
}
//OBJECT HAS A TYPE.
class Abcd{}
	class Efgh extends Abcd{
		public static void main(String[] args) {
			Efgh dd=new Efgh();//here dd is the instance of both child and parent class
		}
}