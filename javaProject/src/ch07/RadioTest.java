package ch07;

public class RadioTest {
//두 객체를 다른방식으로 출력해보았습니다.
	public static void main(String[] args) {
		
		Radio 브리츠 = new Radio();
		브리츠.모델명 = "브리츠";
		브리츠.전원 = true;
		브리츠.채널 = 89.1;
		브리츠.볼륨 = 12;
		브리츠.출력();
		
		
		Radio 아이리버 = new Radio();
		아이리버.setModel("아이리버");
		아이리버.전원 = false;
		아이리버.setChannel(95.1);
		아이리버.setVolume(9);
		String m = 아이리버.getModel();
		double ch = 아이리버.getChannel();
		int vo = 아이리버.getVolume();
		
		
		System.out.println("["+ m +" 라디오]");
		if(아이리버.전원==true)
			System.out.println("라디오가 켜져있습니다.");
		else
			System.out.println("라디오가 꺼져있습니다.");
		System.out.println("현재 채널은 "+ ch +"입니다.");
		System.out.println("볼륨은 "+ vo +"입니다.");
		
	}

}
