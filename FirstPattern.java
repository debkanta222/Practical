package Activity;

public class FirstPattern {
	
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(k+" ");
			k++;
			if(k>9)
				break;
		}
			System.out.println();
			
			}
		}
			
}
