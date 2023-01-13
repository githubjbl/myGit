package ch09;


public class Manager extends Employee {
	private double bonus;
	public void input(int num, String name, String address, String email,
			String rrn, int salary) {
		super.input(num, name, address, email, rrn, salary);
		setNum(num);
		setRrn(rrn);
	}
	
	public void calc() {
		bonus = salary * 0.3;
	}
	
	public void print() {
		System.out.println("===============================");
		System.out.println("사번 : "+getNum()+"\n이름 :"+name+"\n주소 : "+address
				+"\n이메일 : "+email+"\n주민번호 : "+getRrn()+"\n연봉 : "+salary+
				"\n보너스 : "+String.format("%.1f", bonus));
		System.out.println("===============================");
	}
	
}
