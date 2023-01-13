package ch04;

import java.util.Scanner;

public class Nested_If_Score {

	public static void main(String[] args) {
		int score;
		char grade = ' ';
		char level = ' ';
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Java 점수 : ");
		score = scan.nextInt();
		scan.close();
		
		if(score >= 90) {
			grade = 'A';
			if(score > 90) {
				level = '+';
			}else {
				level = '0';
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score>80) {
				level = '+';
			}else {
				level = '0';
			}
		} else if(score >= 70) {
			grade = 'C';
			if(score>70) {
				level = '+';
			}else {
				level = '0';
			}
		} else if(score >= 60) {
			grade = 'D';
			if(score>60) {
				level = '+';
			}else {
				level = '0';
			}
		} else {
			grade = 'F';
			level = '0';
			System.out.println("낙제!");
		}
		System.out.println("당신의 점수는 " + score + "이고 등급은 " + grade + level + " 입니다.");
		
	}

}
