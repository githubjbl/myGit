package ch04;

public class Accumulate {

	public static void main(String[] args) {
		int kor=90;
		int eng=85;
		int mat=79;
		int tot=kor+eng+mat;
		String result="";
		
		for(int i=1; i<=3; i++) {
			result += kor+"\t"+eng+"\t"+mat+"\t"+tot+"\n";//**문자열을 누적시키는 기법
		}
		System.out.println("국어\t영어\t수학\t총점");
		System.out.println(result);
	}

}
