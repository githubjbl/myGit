package ch13;

public class WrapperEx3 {

	public static void main(String[] args) {
		String str = "Hello 1234";
		System.out.println("(Character 사용)");
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				System.out.println(str.charAt(i) + "는 대문자입니다.");
			}else if(Character.isLowerCase(str.charAt(i))) {
				System.out.println(str.charAt(i) + "는 소문자입니다.");
			}else if(Character.isDigit(str.charAt(i))) {
				System.out.println(str.charAt(i) + "는 숫자입니다.");
			}else {
				System.out.println(str.charAt(i) + "는 기타문자입니다.");
			}
		}
		System.out.println("--------------------");
		
		str = str.substring(6);
		int str2 = Integer.parseInt(str);
		
		System.out.println("(Integer 사용)");
		System.out.println("문자 " + Integer.toString(str2) + "입니다.");
		System.out.println("숫자 " + str2 + "입니다.");
		System.out.println("숫자 " + str2 + "+ 2 = " + (str2+2) + "입니다.");
		
		
		
		
	}

}
