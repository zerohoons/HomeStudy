package Study_level1;

import java.util.Scanner;

public class Main11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String a = sc.next();
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum = sum + a.charAt(i)-48;
		}
		System.out.println(sum);
	}
}
