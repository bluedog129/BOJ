package Silver;

import java.util.*;

public class num9095 {
	// 숫자(count)로 합(sum)을 만드는 경우의 수
	public static int go(int sum, int goal) {
		//1. 불가능한 경우
		// 재귀호출을 계속 해도 정답을 찾을 수 없는 경우 
		// 또는 문제의 조건을 만족하지 못하는 경우
		if(sum > goal) {
			return 0;
		}
		
		//2. 정답을 찾는 경우 
		if(sum == goal) {
			return 1;
		}
		
		//3. 다음 경우 호출
		int now = 0;
		for (int i=1; i<=3; i++) {
			now += go(sum+i, goal);
			System.out.println();
		}
		return now;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i<t; i++) {
			// n < 11
			int n = sc.nextInt();
			System.out.println(go(0, n));
		}
	}
}