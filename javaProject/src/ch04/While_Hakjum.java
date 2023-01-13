package ch04;

import java.util.Scanner;

public class While_Hakjum {

	public static void main(String[] args) {
		int kor, eng, mat, tot;
		double avg;
		char grade = ' ';
		String result = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("전체 성적입력이 끝나면 마지막에 -1을 입력하세요.");
		System.out.print("아무정수나 입력하세요 : ");
		int e = scan.nextInt();
		while(e != -1) {
			System.out.print("국어 : ");
			kor = scan.nextInt();
			System.out.print("영어 : ");
			eng = scan.nextInt();
			System.out.print("수학 : ");
			mat = scan.nextInt();
			
			tot = kor + eng + mat;
			avg = tot/3;
			
			if(avg>=90) {
				grade = '수';
			}else if(avg>=80) {
				grade = '우';
			}else if(avg>=70) {
				grade = '미';
			}else if(avg>=60) {
				grade = '양';
			}else {
				grade = '가';
			}
			
			result += kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade+"\n";
			
			System.out.print("계속하려면 아무정수나 입력하세요 : ");
			e = scan.nextInt();
		}
		scan.close();
		
		System.out.println("===========================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("-------------------------------------------");
		System.out.print(result);
		System.out.println("===========================================");
		
		
		
		
	}

}
