package Silver;

import java.util.Scanner;

public class Num1676 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int ans = 0;
		for (int i=5; i<=N; i*=5) {
			ans += N/i;
		}
		System.out.println(ans);
	}
} 