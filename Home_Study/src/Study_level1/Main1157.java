package Study_level1;

import java.util.Arrays;
import java.util.Scanner;

public class Main1157 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String A = sc.next();
		int[] ABC = new int[26];
		
		for (int i = 0; i < A.length(); i++){
			 
			if (65 <= A.charAt(i) && A.charAt(i) <= 90) { // 대문자 범위
				ABC[A.charAt(i) - 65]++;	// 해당 인덱스의 값 1 증가
			}
		    
			else {	// 소문자 범위
				ABC[A.charAt(i) - 97]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for (int i = 0; i < ABC.length; i++) {
			if(max < ABC[i]) {
				max = ABC[i];
				ch = (char)(i+65);
			} else if(max == ABC[i]){
				ch = '?';
			}
		}
		
		System.out.println(ch);
	}
}
