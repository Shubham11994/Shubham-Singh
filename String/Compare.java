/* s1 = hello s2= java   output = s1 less than s2    hint = h<j
   s1 = java s2 = hello  output = s1 greater than s2 hint = h<j   */



import java.util.Scanner;	
	class Compare{

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			String S1 = sc.next();     // A>B>C.....>Z
			String S2 = sc.next();     // a>b>c>....>z
			
			int result = S1.compareTo(S2);
		    if(result<0){
				System.out.print("S1 is less than S2");
			}else
			if(result==0){
				System.out.print("S1 equal to S2");
			}else
				System.out.print("S1 is greater than S2");
	    }
    }
	
