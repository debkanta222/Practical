package Encapsulation;
//write only class
//class having only setter method
class EncapDemo {
private String name;//private data member
public void setName(String name) {
	this.name=name;
}
}
class Encap3{
	public static void main(String[] args) {
		EncapDemo ed=new EncapDemo();
		ed.setName("Debkanta");
		System.out.println(ed.getName());//compilation error as no getter method
	}
}