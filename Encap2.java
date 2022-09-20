package Encapsulation;
// READ ONLY CLASS
//THAT MEANS A CLASS HAVING ONLY GETTER METHOD
class NewEncap {
private String name="Debkanta";
public String getName() {
	return name;
}
}
class Encap2{
	public static void main(String[] args) {
		NewEncap ne=new NewEncap();
		ne.setName("Not Debkanta");//COMPILATION ERROR AS WE  DON'T HAVE ANY SETTER METHOD
		System.out.println(ne.getName());
	}
}