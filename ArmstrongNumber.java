package Activity;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n,sum=0,digit;
		int n1=0;
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter n : ");
		n=scan.nextInt();
		n1=n;
		while(n!=0) {
			digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
		}
		if(n1==sum) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not an armstrong number");
		}

	}

}

