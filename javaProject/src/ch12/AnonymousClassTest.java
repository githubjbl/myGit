package ch12;

interface RemoteControl{//인터페이스는 인스터스할 수 없다.
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
	//interface는 new 해서 객체생성을 못하지만 아래처럼
	//무명클래스 처리하면 자동적으로 인터페이스를 무명 클래스가 상속받아
	//오버라이딩 처리할 수있다.
	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl() {//익명클래스
			
			@Override
			public void turnOn() {
				System.out.println("TV turnon()");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV turnoff()");				
			}
		};//무명내부클래스
		ac.turnOn();
		ac.turnOff();
	}

}
