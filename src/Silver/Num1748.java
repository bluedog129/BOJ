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
			// ����ó��
			if (end >n) {
				end = n;
			}
			// ���� = ���� ���� * ���� ����
			ans += (long)(end =- start + 1) * len;
		}
		System.out.println(ans);
	}
}
