package ch06;

public class StudentPoint {
	static int num = 1001; //학번시작
	static String[] name = {"홍길동","사임당","이순신"};
	static int[] p_Java = {90,95,84};
	static int[] p_Db = {85,79,92};
	static int[] p_Html = {99,88,95};
	static int[] p_Jsp = {76,82,72};
	
	static int[][] p_All = new int[name.length][4];
	
	static int[] total = {0,0,0};
	static double[] avg = {0,0,0};
	
	
	public static void 총점() {
		for(int i=0; i<name.length; i++) 
			total[i] = p_Java[i] + p_Db[i] + p_Html[i] + p_Jsp[i];
	}
	
	public static void 평균() {
		for(int i=0; i<name.length; i++) 
			avg[i] = (double)total[i]/4;
	}
	
	
	public static void 출력() {
		System.out.println("------------------------------------------------------------");
		System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("------------------------------------------------------------");
		
		for(int i=0; i<name.length; i++) {
			System.out.println((num+i)+"\t"+name[i]+"\t"+ p_Java[i]+"\t"
		  +p_Db[i]+"\t"+p_Html[i]+"\t"+p_Jsp[i]+"\t"+total[i]+"\t"+String.format("%.1f", avg[i]));
		}
		
		System.out.println("------------------------------------------------------------");

	}

	public static void main(String[] args) {
		총점();
		평균();
		출력();
	}

}
