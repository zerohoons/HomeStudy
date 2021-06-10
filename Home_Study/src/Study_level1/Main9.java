package Study_level1;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int N;
		int[] point;
		int cnt = 0;
		int a =0;
		double[] avg = new double[C];
		
		for (int i = 0; i < C; i++) {
			N = sc.nextInt();
			point = new int[N];
			for (int j = 0; j < N;j++) {
				point[j] = sc.nextInt();
				a = a+point[j];
			}
			avg[i] = (double)(a/N);
			for (int j = 0; j < point.length; j++) {
				if(point[j]>avg[i]) {
					cnt++;
				}
			}
			avg[i] = (double)(cnt/(double)N);
			cnt = 0;
			a = 0;
		}
		
		for (int i = 0; i < avg.length; i++) {
			System.out.printf("%.3f%%\n",avg[i]*100);
		}
			
	}
}
