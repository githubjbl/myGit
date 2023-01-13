package ch16;

public class BankUse {

	public static void main(String[] args) {
		BankPlayer bp = new BankPlayer();
		
		Thread t1 = new Thread(bp, "홍길동");
		Thread t2 = new Thread(bp, "사임당");
		Thread t3 = new Thread(bp, "이몽룡");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
