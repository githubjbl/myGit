package ch08;

public class MemberUse {

	public static void main(String[] args) {
		Member mb = new Member("김철수", "kim", 50000);
		mb.print();
		
		Member mbScan = new Member();
		mb.print2();
		
	}

}
