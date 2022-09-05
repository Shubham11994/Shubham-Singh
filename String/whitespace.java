
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class whitespace {
    public static void main (String[] args) {
                      
       Scanner sc=new Scanner(System.in);
	   String s=sc.next();
	   int p=0;
	   for(int i=0;i<s.length();i++){
		   if(s.charAt(i)==' '){
			   p=1;
		   }
	   }

	   if(p==1){
		   System.out.println("Yes");
	   }else{
		   System.out.println("No");
	   }
    }
}


/* input - Shubham Singh
   output - Yes
   input - ShubhamSingh
   output - N */
