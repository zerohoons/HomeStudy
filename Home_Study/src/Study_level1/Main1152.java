package Study_level1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		
		StringTokenizer b = new StringTokenizer(a," ");
		
		System.out.println(b.countTokens());
	}

}
