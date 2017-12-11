import java.util.*;

public class CP1_09_hw04_201702012_PROBLEM1 {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());

		int num1 = 0;//6개의 난수를 입력받을 6개의 변수 생성
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;

		for (int i = 1; i < 7; i++) { //for문과 switch문으로 6개의 변수에 6개의 난수 입력
			switch (i) { //switch에 for문의 i를 입력
			case 1: //num1에 첫번째 난수 대입
				num1 = rand.nextInt(45) + 1;
				break;
			case 2: //num2에 난수 대입
				num2 = rand.nextInt(45) + 1;
				while (num1 == num2) { //num1과 num2가 같지 않을때까지 while로 반복
					num2 = rand.nextInt(45) + 1;
				}
				break;
			case 3: //num3에 난수 대입
				num3 = rand.nextInt(45) + 1;
				while (num1 == num3 || num2 == num3) { // num3가 앞서 생성한 난수들과 같지 않을때까지 while로 반복
					num3 = rand.nextInt(45) + 1;
				}
				break;
			case 4: //num4에 난수 대입
				num4 = rand.nextInt(45) + 1;
				while (num1 == num4 || num2 == num4 || num3 == num4) { // num4가 앞서 생성한 난수들과 같지 않을때까지 while로 반복
					num4 = rand.nextInt(45) + 1;
				}
				break;
			case 5: //num5에 난수 대입
				num5 = rand.nextInt(45) + 1;
				while ((num5 == num1) || (num5 == num2) || (num5 == num3) || (num5 == num4)) { //num5가 앞서 생성한 난수들과 같지 않을때까지 while로 반복
					num5 = rand.nextInt(45) + 1;
				}
				break;
			case 6: //num6에 난수 대입
				num6 = rand.nextInt(45) + 1;
				while ((num1 == num6) || (num2 == num6) || (num3 == num6) || (num4 == num6) || (num5 == num6)) { //num6가 앞서 생성한 난수들과 같지 않을때까지 while로 반복
					num6 = rand.nextInt(45) + 1;
				}
				break;
			}
		}
		System.out.println(num1 + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5 + "\t" + num6); //결과물 출력
	}

}
