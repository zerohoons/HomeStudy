package Study_level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		ArrayList<Integer> bag = new ArrayList<Integer>();
		ArrayList<Integer> bag2 = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int cnt = 0;
		while(cnt < N) {
				int O = sc.nextInt();
				int V = sc.nextInt();
				
				bag.add(O);
				bag2.add(V);
				
				cnt++;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < N; j++) {
				if((bag.get(i)+bag.get(j)) <= K) {
					list.add(bag2.get(i)+bag2.get(j));
				}else if(bag.get(i) == K) {
					list.add(bag2.get(i));
				}
			}
		}
		
		System.out.println(Collections.max(list));
		
	}
}
