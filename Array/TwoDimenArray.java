package Array;

import java.util.Scanner;

public class TwoDimenArray {
	public static void main(String[] args) {
		
		 int i,j;	
			 int first[][]= new int[3][3];
			 int second[][]= new int[3][3];
			 int third [][]= new int[3][3];
			
			Scanner sd = new Scanner(System.in);
			
			for(i=0; i<3; i++) {
				for(j=0; i<3; j++) {
					first[i][j]= sd.nextInt();
				}
			}
			
			for(i=0; i<3; i++) {
				for(j=0; i<3; j++) {
					second[i][j]= sd.nextInt();
				}
			}
			
		}
		}


