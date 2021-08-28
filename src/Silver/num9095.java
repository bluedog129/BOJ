package Silver;

import java.util.*;

public class num9095 {
	// ����(count)�� ��(sum)�� ����� ����� ��
	public static int go(int sum, int goal) {
		//1. �Ұ����� ���
		// ���ȣ���� ��� �ص� ������ ã�� �� ���� ��� 
		// �Ǵ� ������ ������ �������� ���ϴ� ���
		if(sum > goal) {
			return 0;
		}
		
		//2. ������ ã�� ��� 
		if(sum == goal) {
			return 1;
		}
		
		//3. ���� ��� ȣ��
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