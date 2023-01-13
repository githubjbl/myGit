package ch07;
//getter,setter방식과 생성자의 매개변수를 활용한 방식 각각 사용했습니다.
public class Auction {
	private String name;
	private String userid;
	private int money;
	private String grade;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getGrade() {
		if(money>=100000)
			grade = "gold";
		else
			grade = "silver";
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+getGrade());
	}
	

//	public Auction(String name, String userid, int money) {
//		this.name = name;
//		this.userid = userid;
//		this.money = money;
//		if(money>=100000)
//			grade = "gold";
//		else
//			grade = "silver";
//		return;
//			
//	}
//	public void print() {
//		System.out.println("이름\t아이디\t구매금액\t등급");
//		System.out.println(name+"\t"+userid+"\t"+money+"\t"+grade);
//	}

}
