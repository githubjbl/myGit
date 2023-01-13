package ch05;

import java.util.Scanner;

public class ArrayScore2d_Scan {

	public static void main(String[] args) {
		int numStu;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 : ");
		numStu = sc.nextInt();
		
		int[][] pyo = new int[3][numStu];
		
		System.out.println("국, 영, 수 점수를 각각 입력하세요 : ");
		for(int i=0; i<pyo.length; i++) {
			System.out.print((i+1)+"번 학생의 점수 : ");
			for(int j=0; j<pyo[i].length; j++) {
				pyo[i][j] = sc.nextInt();
			}
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<pyo.length; i++) {
			int tot = 0;
			float avg = 0.0f;
			char gra = ' ';
			
			System.out.printf("%d\t",(i+1));
			for(int j=0; j<pyo[i].length; j++) {
				tot += pyo[i][j];
				System.out.printf("%d\t",pyo[i][j]);
			}
			avg = (float)tot/pyo.length;
			if(avg>90)
				gra = 'A';
			else if(avg>80)
				gra = 'B';
			else if(avg>70)
				gra = 'C';
			else if(avg>60)
				gra = 'D';
			else
				gra = 'F';
			
			System.out.printf("%d\t%.1f\t%s%n",tot,avg,gra);
		}
		sc.close();
		
	}

}
