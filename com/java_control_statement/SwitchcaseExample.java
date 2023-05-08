 package com.java_control_statement;

import java.util.Scanner;

public class SwitchcaseExample {
	public static void main(String[] args) {
		 double a, b ;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter value A");
		 a=scanner.nextDouble();
		 System.out.println("Enter value B" );
		 b=scanner.nextDouble();
		 System.out.println("Select operation(+ , - , * , /)");
		 char operation = scanner.next().charAt(0);
		 System.out.println("operation:"+operation);
		 
		 switch(operation) {
		 case '+' :
			 System.out.println("ADD:"+(a+b));
			 break;
		 case '-' :
			 System.out.println("SUB:"+(a-b));
			 break;
		 case '*' :
			 System.out.println("MUL:"+(a*b));
			 break;
		 case '/':
			 System.out.println("DIV:"+(a/b));
			 default :
				 System.out.println("Invalid operation");
		 }
	}

}
