package Pyramid.pyramid;

public class FullPyramid {
	public static void main(String[] args) {
		int r = 3, c = 0;
		
		
		for(int i = 1; i <=r; ++i, c = 0) {
			for(int space =1; space <=r - i; ++space) {
				System.out.print("  ");
			}
			
		
			while(c != 2 * i - 1) {
				System.out.print("* ");
				++c;
			}
			System.out.println();
		}
	}

}
