package Study_level1;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] point = new int [n];
		double sum = 0;
		double avg;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			point[i] = a;
		}
		Arrays.sort(point);
		for (int i = 0; i < point.length; i++) {
			sum = sum+point[i];
		}
			sum = sum/point[n-1]*100;
			avg=sum/n;
			System.out.println(avg);
			System.out.println(point[n-1]);
	}
}
