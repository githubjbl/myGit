package ch07;

public class Television {
	//멤버변수(전역변수) 초기화x 지역변수 초기화o
	int channel; // channel=0이 자동으로 초기화 되어있음
	int volume;
	boolean onOff; //전원상태 boolean은 기본적으로 false로 초기화됨. onOff=false;
	
	//멤버메소드
	void print() {
		System.out.println("채널은 "+ channel + "이고 볼륨은 "+volume+"입니다.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}
}
