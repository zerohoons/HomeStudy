package Study_level1;

import java.util.Scanner;

public class Main2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] P = new String[T];
		
		for (int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			String p = "";
			for (int j = 0; j < S.length(); j++) {
				for (int j2 = 0; j2 < R; j2++) {
					p += S.charAt(j);
					
				}
				
			}
			P[i] = p;
		}
		
		for (String k : P) {
			System.out.println(k);
		}
	}
}
