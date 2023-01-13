package ch14;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;

public class EC {
	private int no; //주문번호
	private String orderDate; //주문일자
	private String product; //주문상품
	private String cardName; //카드명
	private String cardNo; //카드번호
	private int pay; //결제금액
	
	DecimalFormat df = new DecimalFormat("###,###");
	
	//getter,setter, 생성자2개
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public int getPay() {
		return pay;
		
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public EC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EC(int no, String orderDate, String product, String cardName, String cardNo, int pay) {
		super();
		this.no = no;
		this.orderDate = orderDate;
		this.product = product;
		this.cardName = cardName;
		this.cardNo = cardNo;
		this.pay = pay;
	}
	
	
	public void print(Map<String, Object> map) { //출력메소드
		@SuppressWarnings("unchecked")
		ArrayList<EC> list2 = (ArrayList<EC>)map.get("list");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("-----------------------------------------------------------------");
		for(EC e : list2) {
			System.out.println(e.getNo()+"\t"+e.getOrderDate()+"\t"+e.getProduct()+"\t"+e.getCardName()
			+"\t"+e.getCardNo().replace(e.getCardNo().substring(5,9), "****")+"\t"+df.format(e.getPay()));
		}
		System.out.println("-----------------------------------------------------------------");
	}
	
	
}
