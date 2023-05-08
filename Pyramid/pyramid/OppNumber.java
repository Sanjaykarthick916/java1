package Pyramid.pyramid;

import java.util.Scanner;

public class OppNumber {
	public static void main(String[] args) {

		int i, j, k, l ;
   int row = 5 ;
		for (i=1; i<=row; i++) {
			for (j=row; j>i; j--) {
				System.out.print("  ");
			}
			for (k=i; k<=(2*i)-1; k++) {
				System.out.print(k+" ");
			}
			for (l=2*i-2; l>=i; l--) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}