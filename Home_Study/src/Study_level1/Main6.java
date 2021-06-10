package Study_level1;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[10];
		int[] B = new int[42];
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			A[i] = sc.nextInt();
			B[A[i]%42]+=1;
		}
		for (int i=0; i< B.length;i++) {
			if(B[i]!=0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
