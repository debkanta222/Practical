package Arrays;

public class MaxNumArray { 
		//creating a method which receives an array as a parameter  
		static void maximum(int arr[]){  
		int max=arr[0];  
		for(int i=0;i<=arr.length-1;i++)  
		 if(arr[i]>max)  
		  max=arr[i];  
		  
		System.out.println(max);  
		}  
		  
		public static void main(String args[]){  
		int a[]={3,4,5,6};//declaring and initializing an array  
		maximum(a);//passing array to method  
		}}  

