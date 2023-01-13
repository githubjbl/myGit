package ch07;

public class Car {
	String color; //null
	int speed; //0
	int gear; //0
	
	//개발자용 메소드
	@Override
	public String toString() {
		return "Car [color=" + color + ", spped=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {//g는 지역변수
		gear = g;
	}
	void speedUp() {
		speed = speed + 10;
	}
	void speedDown() {
		speed = speed - 10;
	}
}
