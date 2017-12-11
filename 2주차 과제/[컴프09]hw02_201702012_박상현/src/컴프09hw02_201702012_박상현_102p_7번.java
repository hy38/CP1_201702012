import java.util.Scanner;

public class 컴프09hw02_201702012_박상현_102p_7번 {

	public static void main(String[] args) {

		float pyung; // 평을 float의 형태로 선언
		float pyungbangMeter; // 평방미터를 float의 형태로 선언

		Scanner input = new Scanner(System.in); // 스캐너 class 사용
		System.out.print("평방미터로 환산하고 싶은 평의 값을 입력하시오: ");
		pyung = input.nextFloat(); // 사용자에게부터 입력받은 평의 값을 pyung에 저장

		pyungbangMeter = pyung * 3.3058f; // 평방미터와 평과의 관계를 나타냄. f를 3.3058뒤에 붙여
											// float자료형을 표현함.

		System.out.println(+pyung + "평은 " + pyungbangMeter + "평방미터 입니다."); // 결과값
																			// 출력
	}

}
