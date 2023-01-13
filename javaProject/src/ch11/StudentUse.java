package ch11;

public class StudentUse {
	
	public static void main(String[] args) {
		Sinfo hong = new Sinfo();
		
		//매개변수없이 배열 사용
		System.out.println("===========================================");
		hong.address();
		System.out.println("-------------------------------------------");
		hong.point();
		System.out.println("===========================================");
		
		//매개변수 사용
		System.out.println("===========================================");
		hong.address("서울 강남구", "hong@gmail.com");
		System.out.println("-------------------------------------------");
		hong.point(90, 85, 79);
		System.out.println("===========================================");
		
		
	}
}
