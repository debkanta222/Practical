package Practice;

  class OverridingEx11 {
  int marks() {
	  return 0;
  }
}
class Computer extends OverridingEx11 {
	int marks() {
		return 1;
	}
}
class Math extends Computer {
	int marks() {
		return 2;
	}
}
class Science extends Math {
	int marks() {
		return 3;
	}
}
class OverridingEx{
	public static void main(String[] args) {
		Science sc=new Science();
		Math m=new Math();
		Computer c=new Computer();
		System.out.println(sc.marks());
		System.out.println(m.marks());
		c.marks();
	}
}