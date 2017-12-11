import java.util.Scanner;

public class 컴프09hw01_201702012_박상현_101p_4번 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);  //Scanner class 사용

		int radius;  //radius를 int의 형태로 선언
		int height;  //height를 int의 형태로 선언
		double volume;  //volume을 double의 형태로 선언
		
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		radius = input.nextInt(); //사용자에게부터 반지름 값을 입력받는다.
		
		System.out.print("원기둥의 높이를 입력하시오: "); //사용자에게부터 높이 값을 입력받는다.
		height = input.nextInt();
		
		volume = radius * radius * Math.PI * height;  //3.14로 하면 책과 결과값이 다르게 나와 다르게 풀었습니다.
		
		System.out.printf("원기둥의 부피는: %.2f", volume); //결과값 출력
	}

}
