package com.java_control_statement; 

public class FindBiggestNumber {
   public static void main(String[] args) {
	   int a = 200550, b = 167500, c = 1007650;
	       
	       if(a>=b && a>=c) {
	    	   System.out.println("A is bigger");
	       }else if(b>=c && b>=a) {
	    	   System.out.println("B is bigger");
	       }else if(c>=a && c>=b) {
	    	   System.out.println("C is bigger");
	       }
}
}
