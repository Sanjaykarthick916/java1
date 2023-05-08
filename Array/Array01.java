package Array;

import java.util.Scanner;

public class Array01 {

	
		public static void First() {
			
			 int array[]= new int [5];
			 Scanner a = new Scanner(System.in);
			 System.out.println("enter the value:");
			 for(int i=0; i<array.length; i++) {
				array[i]= a.nextInt();
			 }
			 System.out.println("enter to the index and value:");
			 for(int i=0; i<array.length; i++) {
				 System.out.println(i+","+array[i]);
		 }
			 
		}
			
			public static void next() {
				 int array[]= new int [5];
				 Scanner a = new Scanner(System.in);
				 System.out.println("enter the value:");
				 for(int i=0; i<array.length; i++) {
					array[i]= a.nextInt();
				 }
				 System.out.println("enter to the index and value:");
				 for(int i=array.length-1; i>=0; i--) {
					 System.out.println(i+","+array[i]);
			 }
			}
			public static void main(String[] args) {
			First();
			next();
			}
		

	}


