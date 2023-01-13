package ch04;

import java.util.Scanner;

public class My_First_Menu {

	public static void main(String[] args) {
		int menu = 0;
		Scanner osk = new Scanner(System.in);

		label: while (true) {
			System.out.println("==[메 뉴]==");
			System.out.println("(1) 한식");
			System.out.println("(2) 양식");
			System.out.println("(3) 중식");
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0) > ");
			String choice = osk.next();
			menu = Integer.parseInt(choice);

			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break label;
			} else if (menu < 1 || menu > 3) {
				System.out.println("잘못된 메뉴입니다. (종료:0)");
				continue;
			}
			label2: for (;;) {
				switch (menu) {
				case 1:
					System.out.println("[한식메뉴]");
					System.out.println("1. 김치찌개");
					System.out.println("2. 된장찌개");
					System.out.println("3. 삼겹살");
					System.out.println("4. 비빔밥");
					System.out.print("한식메뉴를 선택하세요.(한식메뉴선택종료 : 0, 전체종료 : 99) > ");
					String choiceH = osk.next();
					int menuH = Integer.parseInt(choiceH);

					if (menuH == 99) {
						System.out.println("프로그램을 종료합니다.");
						break label;
					} else if (menuH == 0)
						break label2;
					else if (menuH < 1 || menuH > 4) {
						System.out.println("잘못된 메뉴입니다. (한식메뉴선택종료 : 0, 전체종료 : 99)");
						
					}
					switch (menuH) {
					case 1:
						System.out.println(">> 고객님은 김치찌개를 선택하셨습니다.");
						break;
					case 2:
						System.out.println(">> 고객님은 된장찌개를 선택하셨습니다.");
						break;
					case 3:
						System.out.println(">> 고객님은 삼겹살을 선택하셨습니다.");
						break;
					case 4:
						System.out.println(">> 고객님은 비빔밥을 선택하셨습니다.");
						break;
					}
					break;
				case 2:
					System.out.println("[양식메뉴]");
					System.out.println("1. 돈까스");
					System.out.println("2. 비프스테이크");
					System.out.println("3. 카레라이스");
					System.out.print("양식메뉴를 선택하세요.(양식메뉴선택종료 : 0, 전체종료 : 99) > ");
					String choiceY = osk.next();
					int menuY = Integer.parseInt(choiceY);

					if (menuY == 99) {
						System.out.println("프로그램을 종료합니다.");
						break label;
					} else if (menuY == 0)
						break label2;
					else if (menuY < 1 || menuY > 3) {
						System.out.println("잘못된 메뉴입니다. (한식메뉴선택종료 : 0, 전체종료 : 99)");
						continue;
					}
					switch (menuY) {
					case 1:
						System.out.println(">> 고객님은 돈까스를 선택하셨습니다.");
						break;
					case 2:
						System.out.println(">> 고객님은 비프스테이크를 선택하셨습니다.");
						break;
					case 3:
						System.out.println(">> 고객님은 카레라이스를 선택하셨습니다.");
						break;
					}
					break;
				case 3:
					System.out.println("[중식메뉴]");
					System.out.println("1. 짜장면");
					System.out.println("2. 짬뽕");
					System.out.println("3. 탕수육");
					System.out.print("중식메뉴를 선택하세요.(중식메뉴선택종료 : 0, 전체종료 : 99) > ");
					String choiceJ = osk.next();
					int menuJ = Integer.parseInt(choiceJ);

					if (menuJ == 99) {
						System.out.println("프로그램을 종료합니다.");
						break label;
					} else if (menuJ == 0)
						break label2;
					else if (menuJ < 1 || menuJ > 3) {
						System.out.println("잘못된 메뉴입니다. (한식메뉴선택종료 : 0, 전체종료 : 99)");
						continue;
					}
					switch (menuJ) {
					case 1:
						System.out.println(">> 고객님은 돈까스를 선택하셨습니다.");
						break;
					case 2:
						System.out.println(">> 고객님은 비프스테이크를 선택하셨습니다.");
						break;
					case 3:
						System.out.println(">> 고객님은 카레라이스를 선택하셨습니다.");
						break;
					}
					break;
				}// outerSwitch
			} // for
		} // while
		osk.close();
		System.out.println("프로그램을 모두 종료합니다.");

	}// main
}// class
