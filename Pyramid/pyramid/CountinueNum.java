package Pyramid.pyramid;

public class CountinueNum {
	public static void main(String[] args) {
		int rows = 4, num = 1;
		
		for(int i=1; i<=rows; i++) {                     //i=1; 1<=1; i++
			for(int j=1; j<=i; j++) {                    // j=1; 1<=1; j++
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
	}

}
