package Silver;

import java.util.Scanner;

public class Num2004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		long m = sc.nextInt();
		
		// ���� �� �������� �����ش�.
		long count5 = five(n) - five(n - m) - five(m);
		long count2 = two(n) - two(n-m) - two(m);
		
		// 2�� 5 �� ������ ���� ������ �Լ��� ����Ѵ�.
		System.out.println(Math.min(count5, count2));
	}
	//2�� ���� ���� ���ϴ� �Լ�
	private static long two(long num) {
		int count = 0;
		
		while(num >= 2) {
			count += (num/2);
			num /= 2;
		}
		
		return count;
	}
	//5�� ���� ���� ���ϴ� �Լ�
	private static int five(long num) {
		int count = 0;
		
		while(num >= 5) {
			count += (num / 5);
			num /= 5;
		}
		
		return count;
	}
}