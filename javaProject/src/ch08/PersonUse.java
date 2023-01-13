package ch08;

public class PersonUse {

	public static void main(String[] args) {
		Person p1 = new Person(); //객체생성겸 기본생성자 호출
		p1.showInfo();
		
		Person p2 = new Person("이순신");
		p2.showInfo();
		
		Person p3 = new Person("사임당", 150);
		p3.showInfo();
		
		Person p4 = new Person("박지성", 176, 73);
		p4.showInfo();
	}

}
