package com.java_control_statement;

public class ForeloopEachExample {
public static void main(String[] args) {
	 int[]arr={1,2,3,4,5,6,7,8,9,10,};
	 
	 for (int i=0;i<arr.length;i++) {
		 System.out.println(arr[i]);
	 }
	 //for each.....................................
	 //it will not work based on index
	 for(int a : arr) {
		 System.out.println(a);
	 }
	 //labeled for loop.................
	loop1: for(int i=1; i<=5;i++) {
	loop2:	 for(int j=1;j<5;j++) {
			 if(i==3 && j==33) {
		 System.out.println("Break loop1");
		 break loop2;
			 }
			 System.out.println(i+" "+j);
		 }
	 }

	int length=120;
	int total=0;
	for(int i=1;i<=length;i++) {
		total= total+i;
	}
	 System.out.println("Total is:"+total);
}
}
