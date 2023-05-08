package com.java_control_statement;

public class ForleachloopExample {
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		} 
		for (int a: arr) {
			System.out.println(a);
		}
	}

}
