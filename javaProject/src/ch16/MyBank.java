package ch16;

public class MyBank {

	public synchronized void bankBook_hong() {

		int balance_hong = 10; // 통장잔고 만원단위
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "님의 통잔잔고는 " + balance_hong + "만원 입니다.");
			try {
				Thread.sleep(500); //출력 대기시간
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance_hong = balance_hong + 10;
		}
		System.out.println();
	}

	public synchronized void bankBook_saim() {

		int balance_saim = 20; // 통장잔고 만원단위
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "님의 통잔잔고는 " + balance_saim + "만원 입니다.");
			try { 
				Thread.sleep(500); //출력 대기시간
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance_saim = balance_saim + 10;
		}
		System.out.println();
	}
	
	public synchronized void bankBook_mong() {

		int balance_mong = 30; // 통장잔고 만원단위
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "님의 통잔잔고는 " + balance_mong + "만원 입니다.");
			try {
				Thread.sleep(500);//출력 대기시간
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance_mong = balance_mong + 10;
		}
		System.out.println();
		
	}
}
