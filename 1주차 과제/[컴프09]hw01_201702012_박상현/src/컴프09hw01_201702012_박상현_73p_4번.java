import java.util.Scanner;

public class 컴프09hw01_201702012_박상현_73p_4번 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); //Scanner class 사용

		double 섭씨C; //섭씨C를 double의 형태로 선언
		double 화씨F; //화씨F를 double의 형태로 선언
		System.out.print("화씨온도를 입력하세요: ");
		화씨F = input.nextDouble(); //사용자에게 화씨온도를 입력받는다.

		섭씨C = (화씨F - 32) * 5 / 9; //섭씨온도와 화씨온도의 관계를 표현하였다.

		System.out.println("섭씨 온도는 : " + 섭씨C); //결과값을 출력하였다.

	}

}
