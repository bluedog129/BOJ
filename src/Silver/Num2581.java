package Silver;

import java.util.Scanner;

public class Num2581 {
	
	public static boolean prime[]; // �Ҽ��� üũ�� �迭

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int M = in.nextInt();
		int N = in.nextInt();
		
		
		prime = new boolean[N+1]; // 0~N ����
		get_prime();
		
		// �Ҽ��� �ƴ� index = true
		// �Ҽ��� index = false
		// �Ҽ��� ��, �ּҰ�
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = M; i<=N; i++) {
			if(prime[i] == false) {
				sum += i;
				if(min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
	// �����佺�׳׽� ü �˰���
	private static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		// ������ �Լ� : Math.sqrt()
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			// i�� ������� �ɷ��ֱ� ���� �ݺ���
			for(int j = i*i; j < prime.length; j+= i) {
				prime[j] = true;
			}
		}
	}
}
