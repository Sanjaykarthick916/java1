package ipt;

public class FindPrimeNum01 {
	public static void main(String[] args) {
		int i,j;
		for( i=2; i<=100; i++ ) {          // i=2 ; 2<=100; i++
			boolean prime = true;
			
			for( j=2; j<i; j++) {          //j=2; 2<2(i); j++
				if(i%j == 0) {            // 2/2=p ; 3/2=p; 4/2=np; 5/2=p; 6/2=np; 7/2=p;...... 
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.print(" "+i);
			}
		}
	}

}
