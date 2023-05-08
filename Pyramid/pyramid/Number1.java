package Pyramid.pyramid;

public class Number1 {
	
public static void method1() {
		int rows = 4 , number = 1;
	
	for(int i=1; i<=rows; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(number+" ");
			++number;
		}
		System.out.println();
	}
}

public static void method() {
	int rows1 =3,number=10;
for(int i=rows1; i>=0; i--) {
	  for(int j=0; j<=i; j++) {
		  System.out.print(number+" ");
		  number--;
	  }
	  System.out.println();
	 		  }
}	
public static void main(String[] args) {
	method1();
	method();
}
}
