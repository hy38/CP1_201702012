import java.util.Scanner;

public class 컴프09hw01_201702012_박상현_73p_1번 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Scanner class 사용
		double mile;  // mile을 double의 형태로 선언
		double kilometer; //kilometer을 double의 형태로 선언

		System.out.print("마일을 입력하시오: ");
		mile = input.nextDouble(); //사용자로부터 mile의 값을 입력받는다.
		kilometer = mile * 1.609;  //kilometer와 mile의 관계를 표현했다.
		System.out.printf("%.0f마일은 %.2f킬로미터입니다.", mile, kilometer); //printf를 사용하되 교재에 나와있는대로 
		                                                               //소수점 자리수를 제한하였다.

	}

}
