package Array;

import java.util.Scanner;

public class MergedArray01 {
	public static void main(String[] args) {
		int i;
		int ci = 0;
		Scanner r = new Scanner(System.in);

		int n = r.nextInt();
		int[] a = new int[n];
		System.out.println("Elements:");
		for (i = 0; i < n; i++) {
			a[i] = r.nextInt();
		}
		System.out.println("User entered element");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Second Array");
		int[] b = new int[n];
		System.out.println("Elements:");
		for (i = 0; i < n; i++) {
			b[i] = r.nextInt();
		}
		System.out.println("User entered element");
		for (i = 0; i < n; i++) {
			System.out.println(b[i]);
		}
		int[] c = new int[a.length + b.length];
		for (i = 0; i < a.length; i++) {
			c[ci] = a[i];
			ci++;
		}
		for (i = 0; i < b.length; i++) {
			c[ci] = b[i];
			ci++;
		}

		System.out.println("Final element");
		for (i = 0; i < c.length; i++)
			System.out.print(c[i] + " ");

		System.out.println("Odd num:");
		for (i = 0; i < c.length; i++) {
			if (c[i] % 2 != 0) {
				System.out.print("4 " + c[i] + " ");
			}
		}
		System.out.println("Even num:");
		for (i = 0; i < c.length; i++) {
			if (c[i] % 2 == 0) {
			}

		}
	}

}
