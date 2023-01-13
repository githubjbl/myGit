package ch10;


class Pa3 {
	int num = 10;
	String name = "홍길동";
	String email = "hong@gmail.com";

	void print() {
		System.out.println("사번 : "+num+"\n이름 : "+name+"\n이메일 : "+email);
	}
	
}

class Ch3 extends Pa3{
	String tel = "010-1234-5678";
	@Override
	void print() {
		super.print();
		System.out.println("전화 : "+ tel);
	}
}




public class Poly3 {

	public static void main(String[] args) {
		String add = "서울 강남구 역삼동";
		Pa3 p = new Ch3();
		
		p.print();
		System.out.println("주소 : "+add);
	}

}
