package Pyramid.pyramid;

import java.util.Iterator;

public class Symbols {
public static void main(String[] args) {
	int n= 10;
	int x = n;
	
	for(int i = 1; i<=n; i++) {
		for(int j=1; j<=2*n; j++) {
			
	 if((j>=x)!=false&&j<n+i&&j%2==1) {
		 System.out.print("*");
	 }
	 else if ((j>=x)!=false&&j<n+i&&j%2==0) {
		 System.out.print("+");
	 }
	 else
	 System.out.println("");
		}
	}
	x++;
	System.out.print("");
	

	
//	for (int i = 0; i <= 5; i++) {
//		for (int j = 1; j <= i; j++) {
//			
//			if(j%2==0) {
//				System.out.print(" + ");
//			}
//			else {
//				System.out.print("*");
//			}
//			
//		}
//		System.out.println();
//	}



}
}
