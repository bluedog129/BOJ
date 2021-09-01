package Silver;

import java.util.*;
// 암호는 서로 다른 L개의 알파벳 소문자로 구성되며 
// 한 개의 모음(a, e, i, o, u)과 최소 두 개의 자음으로 구성되어 있다.
// 그리고 증가하는 순서의 암호로 배열되어 있다.
// 마지막으로 C개의 문자 종류를 암호에 사용 했다.
// 이 조건을 만족하는 가능성 있는 암호를 모두 구한다.
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
        // 1. 정답을 찾은 경우
    	if (password.length() == n) {
            if (check(password)) {
                System.out.println(password);
            }
            return;
        }
    	// 2. 불량한 경우
        if (i >= alpha.length) return;
        
        // 3. 다음경우
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
        // n: 만들어야 하는 암호의 길이
        // alpha : 사용할 수 있는 알파벳
        // password : 현재까지 만든 암호
        // i : 사용할지 말지 결정해야하는 알파벳의 인덱스
        go(n, alpha, "", 0);
    }
}