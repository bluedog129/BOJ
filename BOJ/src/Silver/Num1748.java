package Silver;

import java.util.Scanner;

public class Num1748 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long ans = 0;
		
		// start ~ startx10 - 1
		for (int start =1, len = 1; start <= n; start *= 10, len++) {
			int end = start*10-1;
			// 예외처리
			if (end >n) {
				end = n;
			}
			// 길이 = 수의 길이 * 수의 갯수
			ans += (long)(end =- start + 1) * len;
		}
		System.out.println(ans);
	}
}
