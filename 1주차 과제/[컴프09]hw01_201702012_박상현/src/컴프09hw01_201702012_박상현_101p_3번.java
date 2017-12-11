import java.util.Scanner;

public class 컴프09hw01_201702012_박상현_101p_3번 {

	public static void main(String[] args) {
		double inch; // inch를 double의 형태로 선언
		double feet; // feet를 double의 형태로 선언
		double cench; // cench를 double의 형태로 선언

		Scanner input = new Scanner(System.in); // Scanner class 사용
		System.out.print("키를 입력하시오: ");
		cench = input.nextDouble(); // 사용자에게부터 cm값을 입력받는다.

		System.out.printf("%.0fcm는 %d피트 %.15f인치입니다.", cench, (int) (cench / (12 * 2.54)),
				(cench - (((int) (cench / (12 * 2.54))) * (12 * 2.54))) / 2.54); // printf를
																					// 사용하여
																					// 결과값을
																					// 출력하였습니다.

	}

}
