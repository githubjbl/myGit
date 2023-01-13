package ch07;

//한개의 파일에 2개이상의 class를 작성할때는 main메소드가 있는 public class의 클래스 이름으로 저장
//다른 파일은 접근제어지정자가 default로 처리되어야함.

class Phone{
	String model;
	int value;
	void print() {
		System.out.println(value + "만원 짜리 " + model + "스마트폰");
	}
}

public class PhoneDemo {

	public static void main(String[] args) {
		Phone myPhone =new Phone();
		myPhone.model = "갤럭시 S20";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone =new Phone();
		yourPhone.model = "iPhone13";
		yourPhone.value = 150;
		yourPhone.print();
	}

}
