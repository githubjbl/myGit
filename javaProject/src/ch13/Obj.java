package ch13;

public class Obj {//extends Object 생략되어 있음

	public static void main(String[] args) {
		Obj e1 = new Obj();
		System.out.println(e1.getClass());//클래스정보
		System.out.println(e1);
		System.out.println(e1.toString());//값을 문자열처리

	}

}
