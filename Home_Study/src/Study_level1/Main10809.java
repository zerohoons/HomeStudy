package Study_level1;

import java.util.Scanner;

public class Main10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int[] cnt = new int[26];
		char abc = 'a';
		for (int i = 0; i < cnt.length; i++) {
				cnt[i]=a.indexOf(abc);
				abc++;
		}
		
		for (int i : cnt) {
			System.out.println(i);
		}
	}
}
