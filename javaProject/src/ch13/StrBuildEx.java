package ch13;

public class StrBuildEx {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		String str2 = " Java Programmer";
		str1.append("I am a");
		str1.append(str2);
		
		System.out.println("---------------------------------------------");
		System.out.println("append()메소드를 활용 : \"" + str1 + "\"");
		System.out.println("replace()를 활용 : \"" + str1.replace(7, 11, "JSP") + "\"");
		System.out.println("substring()을 활용 : \"" + str1.substring(7) + "\"");
		System.out.println("---------------------------------------------");

	}

}
