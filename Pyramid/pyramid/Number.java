package Pyramid.pyramid;

public class Number {
	public static void main(String[] args) {
		int rows =3,number=10;
		 for(int i=rows; i>=0; i--) {
			  for(int j=0; j<=i; j++) {
				  System.out.print(number+" ");
				  number--;
			  }
			  System.out.println();
			 		  }
		}	
	}
 
