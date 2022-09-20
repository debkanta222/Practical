package Abstraction;
// an abstract class which has abstract,non abstract and constructor.
public  abstract class AbstractNew {//parent class
	AbstractNew(){//constructor
		System.out.println(" constructor created");
	}
	abstract void show();//abstract method
	 void method1(){// non abstract method
		 
		System.out.println("method 1 created");
		}}
	 
		class Anything extends AbstractNew{//child class 
			void show() 
			{
				System.out.println(" method running successfully");
			}
			public static void main(String[] args) {
				AbstractNew obj=new Anything();
				obj.method1();
				obj.show();
			}
		}

