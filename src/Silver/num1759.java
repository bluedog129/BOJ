package Silver;

import java.util.*;
// ��ȣ�� ���� �ٸ� L���� ���ĺ� �ҹ��ڷ� �����Ǹ� 
// �� ���� ����(a, e, i, o, u)�� �ּ� �� ���� �������� �����Ǿ� �ִ�.
// �׸��� �����ϴ� ������ ��ȣ�� �迭�Ǿ� �ִ�.
// ���������� C���� ���� ������ ��ȣ�� ��� �ߴ�.
// �� ������ �����ϴ� ���ɼ� �ִ� ��ȣ�� ��� ���Ѵ�.
public class num1759 {
    public static boolean check(String password) {
        int ja = 0;
        int mo = 0;
        
        for (char x : password.toCharArray()) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                mo += 1;
            } else {
                ja += 1;
            }
        }
        return ja >= 2 && mo >= 1;
    }
    
    public static void go(int n, String[] alpha, String password, int i) {
        // 1. ������ ã�� ���
    	if (password.length() == n) {
            if (check(password)) {
                System.out.println(password);
            }
            return;
        }
    	// 2. �ҷ��� ���
        if (i >= alpha.length) return;
        
        // 3. �������
        go(n, alpha, password+alpha[i], i+1);
        go(n, alpha, password, i+1);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        String[] alpha = new String[m];
        
        for (int i=0; i<m; i++) {
            alpha[i] = sc.next();
        }
        
        Arrays.sort(alpha);
        // n: ������ �ϴ� ��ȣ�� ����
        // alpha : ����� �� �ִ� ���ĺ�
        // password : ������� ���� ��ȣ
        // i : ������� ���� �����ؾ��ϴ� ���ĺ��� �ε���
        go(n, alpha, "", 0);
    }
}