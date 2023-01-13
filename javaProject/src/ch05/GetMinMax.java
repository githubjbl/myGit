package ch05;

public class GetMinMax {

	public static void main(String[] args) {
		int[] data = {79, 88, 91, 33, 100, 55, 95};
		int max = data[0];
		int min = data[0];
		
		for(int i =0; i<data.length; i++) {
			if(max<data[i])
				max = data[i];
			if(min>data[i])
				min = data[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}

}
