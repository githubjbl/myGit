package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적처리할 학생수를 입력하세요 : ");
		int numStu = sc.nextInt();
		
		int 성적[] = new int[numStu];
		int tot = 0;
		float avg = 0.0f;
		
		for(int i=0; i<성적.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			성적[i] = sc.nextInt();
			
			tot = tot + 성적[i];
			avg = (float)tot/성적.length;
		}
		
		System.out.println("총점은 "+tot+"점 입니다.");
		System.out.printf("평균성적은 %.1f점 입니다.",avg);
		
		sc.close();
		
		
		
	}

}
