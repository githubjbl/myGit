package ch16;

public class BankPlayer implements Runnable{
	MyBank mb = new MyBank();
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("홍길동")){
			 mb.bankBook_hong();
		}else if(Thread.currentThread().getName().equals("사임당")) {
			mb.bankBook_saim();
		}else if(Thread.currentThread().getName().equals("이몽룡")) {
			mb.bankBook_mong();
		}else 
			System.out.println("오류! 고객명을 다시 확인해주세요.");
	}

}
