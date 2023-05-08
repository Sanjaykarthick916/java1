package Pyramid.pyramid;

public class Fullpyramid2 {
	public static void main(String[] args) {
		int rows = 3;
	int a,b,c;
		
		for(a=1; a<=rows; a++) {
			
			for(b=rows-1; b>(a-1); b--) {
				System.out.print(" ");
			}
			
			for(c=(2*a-1);c>0; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


