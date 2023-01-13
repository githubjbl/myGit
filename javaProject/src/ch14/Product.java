package ch14;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
	private String num; // 제품번호
	private String name; // 제품명
	private String brand; // 제조사
	private String price; // 단가
	private String amount; // 수량
	private String total; // 총액

	List<Product> list = new ArrayList<>();
	DecimalFormat df = new DecimalFormat("###,###");

	public void input() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("제품정보를 입력하세요.");
			System.out.print("제품번호 : ");
			num = sc.next();
			if (num.equals("exit") || num.equals("0")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			System.out.print("제품명 : ");
			name = sc.next();
			if (name.equals("exit") || name.equals("0")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			System.out.print("제조사 : ");
			brand = sc.next();
			if (brand.equals("exit") || brand.equals("0")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			System.out.print("단가 : ");
			String priceA = sc.next();
			if (priceA.equals("exit") || priceA.equals("0")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			price = df.format(Integer.parseInt(priceA));
			System.out.print("수량 : ");
			amount = sc.next();
			if (amount.equals("exit") || amount.equals("0")) {
				System.out.println("입력을 종료합니다.");
				break;
			}

			int totalA = (int) (Integer.parseInt(priceA) * Integer.parseInt(amount) * 1.1);
			total = df.format(totalA);
			list.add(new Product(num, name, brand, price, amount, total));
		}
	}

	public void print() {
		System.out.println("=============================================================");
		System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t수량\t금액(천원)");
		System.out.println("-------------------------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			Product pro = list.get(i);
			System.out.println(pro.getNum() + "\t" + pro.getName() + "\t" + pro.getBrand() + "\t"
					+ String.format("%0.3d", pro.getPrice()) + "\t" + pro.getAmount() + "\t" + pro.getTotal());
		}
		System.out.println("=============================================================");
	}

	public Product() {

	}

	public Product(String num, String name, String brand, String price, String amount, String total) {
		this.num = num;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.amount = amount;
		this.total = total;

	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

}
