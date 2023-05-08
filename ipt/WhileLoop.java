package ipt;

public class WhileLoop {
	public static void main(String[] args) {
		int sum,r,num=0;
		for(int i=0; i<=200; i++) {
			sum=0;
			num=i;
			while(num>0) {
				r=num%10;
				sum=sum+r;
				num=num/10;
			}
			if(sum==9)
				System.out.println(i+" ");
		}
	}

}
