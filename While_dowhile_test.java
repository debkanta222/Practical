package Activity;
import java.util.*;
public class While_dowhile_test {

	public static void main(String[] args) {
		int sum=0;
		int number=0;
		/*Scanner scan=new Scanner (System.in);
		System.out.println("enter the numbers : ");
		int number = scan.nextInt();
		while( number>0) {
			sum=sum+number;
			System.out.println(" enter the numbers : ");
			 number=scan.nextInt();
		}
		System.out.println("sum is" + sum);*/
		Scanner scan=new Scanner (System.in);
		do {
			sum=sum+number;
			System.out.println("enter the numbers : ");
			number=scan.nextInt();
		}
		while(number>=0);
		System.out.println("sum is : "  + sum);

	}

}
