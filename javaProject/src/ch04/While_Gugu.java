package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		int dan;
		int gugu=1;
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		dan = scan.nextInt();
		
		while(gugu <= 9) {
			System.out.println(dan + " x " + gugu + " = " + (dan*gugu));
			gugu++;
		}
		scan.close();
		
	}

}
