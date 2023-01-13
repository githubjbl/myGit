package ch07;

public class Radio {
	String 모델명;
	boolean 전원;
	double 채널;
	int 볼륨;
	
	void 출력() {
		System.out.println("["+ 모델명 +" 라디오]");
		if(전원==true)
			System.out.println("라디오가 켜져있습니다.");
		else
			System.out.println("라디오가 꺼져있습니다.");
		System.out.println("현재 채널은 "+ 채널 +"입니다.");
		System.out.println("볼륨은 "+ 볼륨 +"입니다.");
		System.out.println();
	}
	
	
	String getModel() {
		return 모델명;
	}
	void setModel(String m) {
		모델명 = m;
	}
	
	double getChannel() {
		return 채널;
	}
	void setChannel(double ch) {
		채널 = ch;
	}
	
	int getVolume() {
		return 볼륨;
	}
	void setVolume(int vo) {
		볼륨 = vo;
	}
	
}
