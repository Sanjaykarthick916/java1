 package Leap;

public class FindParticularLeapYear {
	public static void main(String[] args) {
		
		int year = 2000;
		
		if(year%400==0) {
			System.out.println("leap year");
		}
		else if(year%100!=0) {
		System.out.println("Not leap year");
		}
		else if(year%4==0) {
		System.out.println("Leap year");
	}
			}
}
