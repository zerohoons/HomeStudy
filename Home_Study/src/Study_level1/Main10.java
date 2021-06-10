package Study_level1;

import java.util.Arrays;

public class Main10 {	
	public static final int MAX = 10001;
	public static int notSelfNum;
public static void main(String[] args){
	boolean[] selfAry = new boolean[MAX];
	Arrays.fill(selfAry,true);
	for (int i = 1; i<MAX; ++i) {
		notSelfNum = d(i);
		if (notSelfNum<MAX) {
			selfAry[notSelfNum] = false;
		}
	}
	
	for (int i = 1; i < selfAry.length; ++i) {
		if(selfAry[i]) {
			System.out.println(i);
		}
	}
	}
	private static int d(int n) {
	int num = n;
	do { num += n%10;
	}while ((n /= 10)!=0);
	return num;
	}
}
