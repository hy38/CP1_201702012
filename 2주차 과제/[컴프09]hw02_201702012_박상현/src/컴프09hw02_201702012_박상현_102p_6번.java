import java.util.Scanner;

public class 컴프09hw02_201702012_박상현_102p_6번 {

	public static void main(String[] args) {

		int money_500; // 500원짜리의 개수를 int의 형태로 선언
		int money_100; // 100원짜리의 개수를 int의 형태로 선언
		int money_50; // 50원짜리의 개수를 int의 형태로 선언
		int money_10; // 10원짜리의 개수를 int의 형태로 선언

		int totalAmount; // 저금통에 들어있는 금액의 총합을 int로 선언

		Scanner input = new Scanner(System.in); // 스캐너 class 사용

		System.out.print("500원짜리 동전의 개수를 입력하시오: ");
		money_500 = input.nextInt(); // 사용자에게 500원 짜리 동전의 개수를 입력받아 money_500에
										// 저장함.

		System.out.print("100원짜리 동전의 개수를 입력하시오: ");
		money_100 = input.nextInt(); // 사용자에게 100원 짜리 동전의 개수를 입력받아 money_100에
										// 저장함.

		System.out.print("50원짜리 동전의 개수를 입력하시오: ");
		money_50 = input.nextInt(); // 사용자에게 50원 짜리 동전의 개수를 입력받아 money_50에 저장함.

		System.out.print("10원짜리 동전의 개수를 입력하시오: ");
		money_10 = input.nextInt(); // 사용자에게 10원 짜리 동전의 개수를 입력받아 money_10에 저장함.

		totalAmount = money_500 * 500 + money_100 * 100 + money_50 * 50 + money_10 * 10; // 저금통에
																							// 들어있는
																							// 돈의
																							// 총합을
																							// 구하는
																							// 수식

		System.out.println("저금통에 들어있는 돈의 총액은 :" + totalAmount); // 결과값 출력

	}

}
