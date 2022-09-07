import java.util.Scanner;	
	class Factorial{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.print(Fact(n));
		}
	// Method-1:In iteration Approch.
	    /*
		public static int Fact(int n){
			int result = 1;
			for(int i=1; i<=n; i++){
			
				result = result * i;
			}return result;
		
         */		
			
	// Method-2:in Recurtions Approch.
		public static int Fact(int n){
			if(n==0){
				return 1;
			}
			return n*Fact(n-1);
		}
	}
	
	
	
	    
		 //Time Complexity =O(n)
		//Space Complexity = O(n)
