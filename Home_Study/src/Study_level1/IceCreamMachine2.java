package Study_level1;

import java.util.ArrayList;
import java.util.Iterator;

public class IceCreamMachine2 {

	public void scoops(String[] a, String[] b) {
		String[][] c = null;
		if (a.length == 0) {
			for (String[] strings : c) {
				System.out.println(strings);
			}
		}else if(a.length>=b.length) {
			c = new String[a.length][2];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					c[i][0] = a[i];
					c[i][1] = b[j];
				}
			}
		}else {
			c = new String[b.length][2];
			for (int i = 0; i <b.length; i++) {
				for (int j = 0; j < a.length; j++) {
					c[i][0] = a[j];
					c[i][1] = b[i];
				}
			}
			for (String[] strings : c) {
				System.out.println(strings);
			}
		}
		
		for (int i = 0; i < c.length; i++) {
				System.out.println(c[i][0]+","+c[i][1]);
			}
		}
		
	}
