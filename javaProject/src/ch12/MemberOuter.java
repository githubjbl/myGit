package ch12;

public class MemberOuter {
	int num = 0;
	public void oMethod(String name,String email) {
		class MemberInner{
			public void iMethod() {
				num++;
				System.out.println("고객번호 : " + num);
				System.out.println("이름 : " + name);
				System.out.println("이메일 : " + email);
			}
		}
		MemberInner mi = new MemberInner();
		System.out.println("---------------------------");
		mi.iMethod();
		System.out.println("---------------------------");
	}
	public static void main(String[] args) {
		MemberOuter mo = new MemberOuter();
		mo.oMethod("홍길동", "hong@gmail.com");
	}
}
