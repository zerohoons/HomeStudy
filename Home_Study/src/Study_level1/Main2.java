package Study_level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 9; i++) {
			int n = sc.nextInt();
			list.add(n);
		}
		System.out.println(Collections.max(list));
		System.out.println(list.indexOf(Collections.max(list))+1);
	}
}
