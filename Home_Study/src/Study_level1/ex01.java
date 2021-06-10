package Study_level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i = 0; i < N ; i++) {
		int num = sc.nextInt();
		list.add(num);
	}
	
	System.out.print(Collections.min(list)+" ");
	System.out.print(Collections.max(list));
	}
}
