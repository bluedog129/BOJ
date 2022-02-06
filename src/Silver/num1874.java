package Silver;

import java.util.*;

public class num1874 {
	
	public static void stackSqunce(int[] a) {
		int n = a.length;
		Stack<Integer> stack = new Stack<Integer>();
		int m = 0;
		StringBuilder sb = new StringBuilder();
		for(int x : a) {
			// m : 스택에 추가되어야 하는 수
			// 스택에 추가 해야하는 수(m)보다 x가 작으면 push
			if(x>m) {
				while (x > m) {
					stack.push(++m);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				// m 과 x가 같으면 pop() 
				// peek()가 x와 같지 않으면 no
				if (stack.peek() != x) {
					System.out.println("NO");
					return;
				}
				stack.pop();
				sb.append("-\n");
			}
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		stackSqunce(a);
	}
}