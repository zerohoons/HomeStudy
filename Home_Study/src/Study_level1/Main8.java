package Study_level1;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		int point = 0;
		int[] result = new int [num];
		String test[] = new String[num];
		
		for (int i = 0; i < num; i++) {
			test[i] = sc.next();
			
			for (int j = 0; j < test[i].length(); j++) {
				if(test[i].charAt(j)=='O') {
					cnt++;
					point += cnt;
				}else {
					cnt=0;
				}
			}
			result[i] = point;
			cnt = 0;
			point = 0;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
