package Silver;

import java.util.*;

public class num1874 {
	
	public static void stackSqunce(int[] a) {
		int n = a.length;
		Stack<Integer> stack = new Stack<Integer>();
		int m = 0;
		StringBuilder sb = new StringBuilder();
		for(int x : a) {
			// m : ���ÿ� �߰��Ǿ�� �ϴ� ��
			// ���ÿ� �߰� �ؾ��ϴ� ��(m)���� x�� ������ push
			if(x>m) {
				while (x > m) {
					stack.push(++m);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				// m �� x�� ������ pop() 
				// peek()�� x�� ���� ������ no
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