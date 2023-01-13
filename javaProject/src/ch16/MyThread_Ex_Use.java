package ch16;

public class MyThread_Ex_Use {

	public static void main(String[] args) {
		MyThread_EX m1 = new MyThread_EX("스레드1");
		MyThread_EX m2 = new MyThread_EX("스레드2");
		
		m1.setPriority(Thread.MAX_PRIORITY);
		m2.setPriority(Thread.MIN_PRIORITY);
		
		m1.start();
		m2.start();
	}

}
