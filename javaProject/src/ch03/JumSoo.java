package ch03;

import java.util.Scanner;

public class JumSoo {

	public static void main(String[] args) {
		String name;
		int javaPoint, dbPoint, htmlPoint, jspPoint, tot;
		double avg;
		
		Scanner jumsoo = new Scanner(System.in);
		System.out.print("이름 : ");
		name = jumsoo.next();
		System.out.print("Java : ");
		javaPoint = jumsoo.nextInt();
		System.out.print("DB : ");
		dbPoint = jumsoo.nextInt();
		System.out.print("HTML : ");
		htmlPoint = jumsoo.nextInt();
		System.out.print("JSP : ");
		jspPoint = jumsoo.nextInt();
		
		tot = javaPoint + dbPoint + htmlPoint + jspPoint;
		avg = tot / 4;
		
		System.out.println("=======================================================");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f\n", 
							name, javaPoint, dbPoint, htmlPoint, jspPoint, tot, avg);
		System.out.println("=======================================================");
		
		jumsoo.close();
	}

}
