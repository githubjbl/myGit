package ch03;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
	
		int 가로, 세로;
		
		System.out.println("==================================");
		Scanner rectangle = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		가로 = rectangle.nextInt();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		세로 = rectangle.nextInt();
		
		System.out.println("직사각형의 넓이는 " + (double)가로*세로 + "입니다.");
		
		System.out.println("=================================");
		
		rectangle.close();
	}

}
