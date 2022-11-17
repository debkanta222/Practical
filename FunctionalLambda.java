package Collections;

public interface FunctionalLambda {
int add(int a,int b);
}
class LambdaEg{
	public static void main(String[] args) {
		FunctionalLambda fl=(a,b)->{
			return (a*b);
		};
		fl.add(10,20);
		System.out.println(fl.add(10,20));
	}
}