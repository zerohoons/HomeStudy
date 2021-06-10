package Study_level1;

import java.util.Scanner;

public class Main5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		int sum = 0;
		a = a.toLowerCase();
		
		for (int i = 0; i < a.length(); i++) {
			int b = a.charAt(i)-96;
			if(b>=1&&b<4) {
				sum = sum + 3;
			} else if(b<7) {
				sum = sum + 4;
			}else if(b<10) {
				sum = sum + 5;
			}else if(b<13) {
				sum = sum + 6;
			}else if(b<16) {
				sum = sum + 7;
			}else if(b<20) {
				sum = sum + 8;
			}else if(b<23) {
				sum = sum + 9;
			}else if(b<27) {
				sum = sum + 10;
			}
		}
		
		System.out.println(sum);
	}
}
