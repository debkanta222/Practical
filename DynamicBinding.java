package Practice;
class Animal{  
	 void eat(){System.out.println("animal is eating...");}  
	}  
	  
	class DynamicBinding extends Animal{  
	 void eat(){System.out.println("dog is eating..."); 
	  super.eat();}
	 public static void main(String args[]){  
	  Animal a=new DynamicBinding();  
	  a.eat();  
	 }  
	}
