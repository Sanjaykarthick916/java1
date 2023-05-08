package com.java_control_statement;

public class IfelseifExample {
public static void main(String[] args) {
  int mark = 35;
  
  if(mark<35) {
	 if (mark <=35)
	         System.out.println("Faild");
                   }
//  
            else if (mark >= 35 && mark <= 50) {
	         System.out.println("D GRADE");  
	         
                   }else if (mark > 50 && mark <= 75) {
	         System.out.println("C GRADE");
	         
                   }else if (mark >75 && mark <= 90) {
	         System.out.println("B GRADE");
	         
                   }else if (mark > 90 && mark <= 100) {
	         System.out.println("A GRADE");
	         
                   }else {
	         System.out.println("INVALID MARK");
                   }
  
  
   }
  }