package Leap;

import java.util.Scanner;

public class UserInputYear {
	public static void main(String[] args) {
		
		  Scanner a = new Scanner(System.in);
		  int b = a.nextInt();
		  System.out.println("Enter the year");
		  
		  for(int i=b; i<=2023; i++) {
		  if(i%4==0 && i%100!=0 || i%400==0) {
			  System.out.println(i+" "+"Leap year"); 
			  
		  }
		  else{ 

			System.out.println(i+" "+"Its not a leap year");  

		  }
		  
		  
	} 
	}
}

