package com.java_control_statement;

public class BreakContinueExample {
	public static void main(String[] args) {
		int counter= 1;
		while(counter<=10) {
			if(counter==5) {
			
				counter++;
				//break;
				continue;
			
			}
			System.out.println(counter+" ");
			counter++;
		}
	}

}
