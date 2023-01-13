package ch08;

import java.util.Scanner;

public class Member {
	private String name;
	private String userid;
	private int money;
	private String grade;
	Scanner sc = new Scanner(System.in);

	public Member(String name, String userid, int money) {

		this.name = name;
		this.userid = userid;
		this.money = money;
		if (money >= 100000)
			grade = "gold";
		else
			grade = "silver";
		return;
	}

	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name + "\t" + userid + "\t" + money + "\t" + grade);

	}

	//Scanner를 활용해서 매개변수를 입력받아보았습니다.
	public Member() {

		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("아이디를 입력하세요 : ");
		userid = sc.next();
		System.out.print("구매금액을 입력하세요 : ");
		money = sc.nextInt();
		this.name = name;
		this.userid = userid;
		this.money = money;
		if (money >= 100000)
			grade = "gold";
		else
			grade = "silver";
		this.grade = grade;
		sc.close();
	}
	public void print2() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name + "\t" + userid + "\t" + money + "\t" + grade);

	}
	
}
