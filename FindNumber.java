package Practice;

import java.util.*;

class FindNumber {
	public static void main(String args[]) {
      System.out.println("The numbers divisible by 5 are : ");
    for(int j = 1; j <=200; j++)
    {
       if (j % 5 == 0 )
           System.out.print(j+" ");}
           System.out.println();
           System.out.println("The numbers divisible by 7 are : ");
   for(int i=1;i<=200;i++) {
	    if(i%7==0) {
	    	System.out.print(i+" ");}}
            System.out.println();
	    System.out.println("The numbers divisible by both 5 and 7 are : ");
	    for(int k=1;k<=200;k++) {
	    	if(k%35==0) {
	    		System.out.print(k+" ");
	    	}
	    }
    }
    }
