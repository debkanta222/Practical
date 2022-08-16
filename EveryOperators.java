package Operators;

public class EveryOperators {

	public static void main(String[] args) {
		System.out.println("the numbers are:");
		//initializing a and b
		int a=5;
		int b=6;
		
		//arithmetic operators
		
		System.out.println(a+","+b);//printing the numbers
		System.out.println("the result of addition is:" + (a+b));//addition
		System.out.println("the result of subtraction is:" +(a-b));//subtraction
		System.out.println("the result of multiplication is:" +(a*b));//multiplication
		System.out.println("the result of division is:" +(a/b));//division
		System.out.println("the result of modulo is:" +(a%b));//remainder
		
		//unary operators
		
		System.out.println(a++ + ++a);//unary operators
		System.out.println(a-- - --a);
		
		//logical operators
		
		System.out.println(a<b&&b>a);//logical and operator
		System.out.println(a<b||b>a);//logical or operator
		
		//relational operators
		
		System.out.println(a>b);//greater than
		System.out.println(a<b);//less than
		System.out.println(a!=b);//not equals to
		System.out.println(a==b);//equals to
		
	





	}

}
