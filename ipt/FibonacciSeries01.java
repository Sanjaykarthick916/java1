package ipt;

public class FibonacciSeries01 {
	public static void main(String argd[]) {
		  int i,n1=0, n2=1, n3, count= 10;
		
		  for(i=0; i<count; i++) {

			  n3=n1+n2;
			  n1=n2;
			  n2=n3;
			 
			  System.out.print(" "+n3);
			  
			 
		  }
	   } 
	}  


