package algorithm;

import java.util.Scanner;

public class Fibonacci {
	public static int fibonacci (int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			int zero = 0;
			int one =1;
			int fn = 0;
			for(int i=2; i<=n; i++) {
				fn = zero + one;
				zero = one;
				one = fn;
			}
			return fn;
		}
	}
	public static void main(String args[]) {
		System.out.println("please input n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("result is:" + fibonacci(n));
	}
}
