package ch05;

import java.util.Scanner;

public class ArrayPoint2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num_stu = 2;
		int i;
		
		String[] name = new String[num_stu];
		int[] kor = new int[num_stu];
		int[] eng = new int[num_stu];
		int[] mat = new int[num_stu];
		int[] tot = new int[num_stu];
		double[] avg = new double[num_stu];
		
		double avg_Class=0.0;
		
		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");
		for(i=0; i<num_stu; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.next();
			System.out.print("국어점수 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어점수 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학점수 : ");
			mat[i] = sc.nextInt();
			System.out.println();
			
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3;
			avg_Class = avg_Class+avg[i];
		}
		
		
		
		for(i=0; i<num_stu; i++) {
			
			System.out.printf("이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %.1f\n\n",
					name[i],kor[i],eng[i],mat[i],tot[i],avg[i]);
		}
		System.out.println("=========================");
		System.out.println("학급평균 : " + String.format("%.1f", avg_Class/num_stu));
		
		sc.close();
		
	}

}
