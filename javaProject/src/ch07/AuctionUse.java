package ch07;

public class AuctionUse {

	public static void main(String[] args) {
		Auction au = new Auction();
		
		au.setName("홍길동");
		au.setUserid("hong");
		au.setMoney(150000);
		au.print();
		
//		Auction au = new Auction("홍길동", "hong", 150000);
// 		au.print();
//		
	}

}
