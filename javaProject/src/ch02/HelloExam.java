package ch02;



/**
 * @author 이재복
 * @version 1.0 2022-12-13
 * 
 *  
 *  */

public class HelloExam {

	public static int sum(int n, int m) { //메소드
		return n + m;
	}
	
	//프로그램의 시작은 메인메소드부터
	public static void main(String[] args) { //메인메소드
		int i = 20; //변수 초기화(할당)
		int s; //변수선언
		char a; //변수선언
		
		s = sum(i, 10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}
