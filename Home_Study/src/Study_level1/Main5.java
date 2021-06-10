package Study_level1;

import java.util.Scanner;

public class Main5 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int A = sc.nextInt();
	 int B = sc.nextInt();
	 int C = sc.nextInt();
	 
	 int sum = A*B*C;
	 
	 int cnt[] = new int[10];
	 
	 while(sum != 0) {
		 cnt[sum%10]++;
		 sum/=10;
	 }
	 
	 for (int k :cnt) {
		 System.out.println(k);
	}
}
}
