package ch11;

public class Sinfo implements Student {
	String name = "홍길동";
	int total = 0;
	double avg = 0.0;
	
	//인터페이스 매개변수 없이 배열을 사용해서 만들어보았습니다.
	String[] infor = {"서울 강남구", "hong@gmail.com"};
	int[] score = {90, 85, 79};
	
	@Override
	public void address() {
		System.out.println("이름\t주소\t\t이메일");
		System.out.print(name+"\t");
		for(int i=0; i<infor.length; i++) {
			System.out.print(infor[i]+"\t");
		}
		System.out.println();
	}

	@Override
	public void point() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(name+"\t");
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i]+"\t");
			total += score[i];
			avg = total/score.length;
		}
		System.out.printf("%d\t%.1f",total,avg);
		System.out.println();
	}


	
	//인터페이스에 매개변수를 넣어서 만들어 보았습니다.
	@Override
	public void address(String add, String email) {
		System.out.println("이름\t주소\t\t이메일");
		System.out.println(name + "\t" + add +"\t" + email);
	}
	
	@Override
	public void point(int kor, int eng, int mat) {
		total = kor+eng+mat;
		avg = total/3;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"
		+total+"\t"+String.format("%.1f", avg));
	}
}
