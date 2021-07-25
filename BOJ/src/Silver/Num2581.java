package Silver;

import java.util.Scanner;

public class Num2581 {
	
	public static boolean prime[]; // 소수를 체크할 배열

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int M = in.nextInt();
		int N = in.nextInt();
		
		
		prime = new boolean[N+1]; // 0~N 생성
		get_prime();
		
		// 소수가 아닌 index = true
		// 소수인 index = false
		// 소수의 합, 최소값
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
	// 에라토스테네스 체 알고리즘
	private static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		// 제곱근 함수 : Math.sqrt()
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			// i의 배수들을 걸러주기 위한 반복문
			for(int j = i*i; j < prime.length; j+= i) {
				prime[j] = true;
			}
		}
	}
}
