package Study_level1;

import java.util.ArrayList;

public class Problem5 {
	public static void main(String[] args) {
		String[] a = {"Ava", "Emma", "Olivia"};
		String[] b = {"Olivia", "Sophia","Emma"};
		ArrayList list = new ArrayList(); 
		for (int i = 0; i < b.length; i++) {
			if(!list.contains(a[i])) {
				list.add(a[i]);
			}
			for (int j = 0; j < b.length; j++) {
				if(!list.contains(b[j])) {
					list.add(b[j]);
				}
			}
		}
		System.out.println(list);
	}
}