package MethodOverloading;

  class Overloading{
	static int add(int a, int b) {
		return a+b;
	}
static double add(double a, double b) {
	return a+b;
}
class Add{
	public static void main(String[] args) {
		System.out.println(Overloading.add(10, 15));
		System.out.println(Overloading.add(10.6, 16.8));
	}
}
}
