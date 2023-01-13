package ch07;

public class PersonUse2{
	
	public static void main(String[] args) {
		CopyPerson p1 = new CopyPerson();
		p1.setName("홍길동");
		p1.setAge(30);
		p1.setMailAdr("hong@naver.com");
		p1.setAdr("서울 강남구 역삼동");
		p1.print();
		
		CopyPerson p2 = new CopyPerson();
		p2.setName("사임당");
		p2.setAge(25);
		p2.setMailAdr("saimdang@gmail.com");
		p2.setAdr("서울 강남구 개포동");
		p2.print();
		
	}
}


//person.java내용을 복사해서 편집한 class
class CopyPerson {
	private String name;
	private int age;
	private String mailAdr;
	private String adr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0 || age>150) 
			System.out.println("입력값이 정확하지 않습니다.");
		else 
			this.age = age;
	}
	public String getMailAdr() {
		return mailAdr;
	}
	public void setMailAdr(String mailAdr) {
		this.mailAdr = mailAdr;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이메일 : " + mailAdr);
		System.out.println("주소 : " + adr);
		System.out.println();
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	

