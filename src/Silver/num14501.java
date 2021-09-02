package Silver;

import java.util.Scanner;
// N+1일이 되는 날 퇴사를 하려고 한다.
// 남은 N일동안 최대한 많은 상담을 하려고 한다.
// 하루에 하나의 상담이 가능하고
// i일에 상담을 하면, T[i]일이 걸리고 P[i]원을 번다.
public class num14501 {
    static final int inf = -100000000;
    static int[] t;
    static int[] p;
    static int n;
    static int ans = 0;
    static void go(int day, int sum) {
    	// 1. 정답을 찾은 경우
        if (day == n+1) {
            if (ans < sum) ans = sum;
            return;
        }
        // 2. 불가능한 경우
        if (day > n+1) {
            return;
        }
        // 3. 다음 경우 호출
        // 상담을 하지 않는다.
        go(day+1, sum);
        // 상담을 한다.
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