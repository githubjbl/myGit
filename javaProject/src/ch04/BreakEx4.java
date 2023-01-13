package ch04;

public class BreakEx4 {

	public static void main(String[] args) {
		int n = 1;
		String result = "";
		while(true) {
		result += n+" Hello World\n";
		n++;
		if(n==8) break;
		}
		System.out.println("---------------------------------");
		System.out.print(result);
		System.out.println("n값이 8이며 while문 빠져나옴");
		System.out.println("---------------------------------");
	}

}
