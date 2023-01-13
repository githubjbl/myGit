package ch05;

public class ArrayScore2D {
	public static void main(String[] args) {
		int pyo[][] = {{100,100,100},{89,76,92},{88,69,72},{45,60,59},{96,92,89}};
		
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<pyo.length; i++) {
			
			int tot=0;
			float avg=0.0f;
			char gra=' ';
			
			System.out.printf("%d\t",i+1);
			
			for(int j=0; j<pyo[i].length; j++) {
				tot += pyo[i][j];
				System.out.printf("%d\t",pyo[i][j]);
			}
			 
			avg = (float)tot/pyo[i].length;
			if(avg>90)
				gra = 'A';
			else if(avg>80)
				gra = 'B';
			else if(avg>70)
				gra = 'C';
			else if(avg>60)
				gra = 'D';
			else
				gra = 'F';
			System.out.printf("%d\t%.1f\t%s%n",tot,avg,gra);
		}
		
		
		
		
	}
}
