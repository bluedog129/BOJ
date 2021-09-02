package Silver;

import java.util.Scanner;
// N+1���� �Ǵ� �� ��縦 �Ϸ��� �Ѵ�.
// ���� N�ϵ��� �ִ��� ���� ����� �Ϸ��� �Ѵ�.
// �Ϸ翡 �ϳ��� ����� �����ϰ�
// i�Ͽ� ����� �ϸ�, T[i]���� �ɸ��� P[i]���� ����.
public class num14501 {
    static final int inf = -100000000;
    static int[] t;
    static int[] p;
    static int n;
    static int ans = 0;
    static void go(int day, int sum) {
    	// 1. ������ ã�� ���
        if (day == n+1) {
            if (ans < sum) ans = sum;
            return;
        }
        // 2. �Ұ����� ���
        if (day > n+1) {
            return;
        }
        // 3. ���� ��� ȣ��
        // ����� ���� �ʴ´�.
        go(day+1, sum);
        // ����� �Ѵ�.
        go(day+t[day], sum+p[day]);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = new int[n+1];
        p = new int[n+1];
        for (int i=1; i<=n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        go(1, 0);
        System.out.println(ans);
    }
}