package ch10;

public class StaticMethod2 {
	static int num = 10; //사번
	static String name = "홍길동";
	String email = "hong@gmail.com";
	String hp = "010-1234-5678";
	String add = "서울 강남구 역삼동";
	
	public static void printA() {
		StaticMethod2 s1 = new StaticMethod2();
		System.out.println("==== printA() ====");
		System.out.println("사번 : "+num+"\n이름 : "+name+"\n이메일 : "+s1.email+
				"\n전화 : "+s1.hp+"\n주소 : "+s1.add);
	}
	
	public void printB() {
		System.out.println("==== printB() ====");
		System.out.println("사번 : "+num+"\n이름 : "+name+"\n이메일 : "+email+
				"\n전화 : "+hp+"\n주소 : "+add);
	}
	
	
	
	public static void main(String[] args) {
		printA();
		StaticMethod2 s2 = new StaticMethod2();
		
		System.out.println();
		
		s2.printB();
		
	}

}
