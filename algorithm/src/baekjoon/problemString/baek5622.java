package baekjoon.problemString;

import java.util.Scanner;

public class baek5622 {

	public static void main(String[] args) {
		
		//1번쨰 풀이
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int time = 0;
		char c;
		
		
		for(int i = 0; i < str.length(); i++) {
			
			c = str.charAt(i);
			if(c >= 'A' && c <= 'C') {
				time += 3;
			}else if(c >= 'D' && c <= 'F') {
				time += 4;
			}else if(c >= 'G' && c <= 'I') {
				time += 5;
			}else if(c >= 'J' && c <= 'L') {
				time += 6;
			}else if(c >= 'M' && c <= 'O') {
				time += 7;
			}else if(c >= 'P' && c <= 'S') {
				time += 8;
			}else if(c >= 'T' && c <= 'V') {
				time += 9;
			}else if(c >= 'W' && c <= 'Z') {
				time += 10;
			}
			
		}
		
		System.out.println(time);
	}
	

}
