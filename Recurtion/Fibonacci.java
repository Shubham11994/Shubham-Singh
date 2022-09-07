  /*
The Fibonacci series is a series where the next term is the sum of the previous two terms. 
The first two terms of the Fibonacci sequence are 0 followed by 1. 
Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.  */
import java.util.Scanner;	
	class Fibonacci{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.print(fibo(n));
		}
	// Method-1:in iteration Approch.this process too mach time and very slow ececute
		
		public static int fibo(int n){
		   
			int temp,a=0,b=1;
			if (n<=1)
			   return a;
		
			for(int i=0;i<n;i++){
				
				temp= a+b;
				a = b;
				b = temp;
			}
		  return a;
		
     
	// Method-2:in Recurtions Approch.this process fast time and very fast ececute.bacuse it store strac memory.	
		
		/*
		public static int fibo(int n){
			if(n<=1)
				return n;
			return fibo(n-1)+fibo(n-2);
		 
		*/
			
			
			
		}
	}
	     
     //Time Complexity =O(n)
	//Space Complexity = O(n)