package Silver;

import java.util.Scanner;

public class Num2004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		long m = sc.nextInt();
		
		// 각각 몇 제곱인지 구해준다.
		long count5 = five(n) - five(n - m) - five(m);
		long count2 = two(n) - two(n-m) - two(m);
		
		// 2와 5 중 제곱의 수가 덜나온 함수를 출력한다.
		System.out.println(Math.min(count5, count2));
	}
	//2의 제곱 수를 구하는 함수
	private static long two(long num) {
		int count = 0;
		
		while(num >= 2) {
			count += (num/2);
			num /= 2;
		}
		
		return count;
	}
	//5의 제곱 수를 구하는 함수
	private static int five(long num) {
		int count = 0;
		
		while(num >= 5) {
			count += (num / 5);
			num /= 5;
		}
		
		return count;
	}
}