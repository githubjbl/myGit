package ch11;

public class ContollableDemo {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();
		
		Controllable.reset();//static 메소드는 클래스이름.메소드로 접근가능하다.
	
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
	
		Notebook n = new Notebook();
		n.turnOn();
		n.turnOff();
		n.repair();
		Controllable.reset();
	}

}
