import java.util.*;

public class Reservation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] seat = new int[10]; // 크기가 10인 seat배열을 생성한다.
		for (int i = 0; i < seat.length; i++)
			seat[i] = 0; // seat배열에 0을 모두 대입한다.
		int sum = 0; // while조건문 안에 넣을 변수 sum을 0으로 초기화한다.

		while (sum < 55) {
			System.out.println("좌석을 예약하시겠습니까? (1 또는 0)");
			int will = input.nextInt(); // 예약할것인지를 입력받는다.
			if (will == 1) {

				System.out.println("현재의 예약 상태는 다음과 같습니다.");
				System.out.println("------------------------------------------");
				for (int i = 1; i <= 10; i++)
					System.out.print(i + "  ");
				System.out.println();
				System.out.println("------------------------------------------");
				for (int i = 0; i < seat.length; i++) {
					System.out.print(seat[i] + "  ");
				}
				System.out.println();
				System.out.println("몇번째 좌석을 예약하시겠습니까? ");
				int seatNum = input.nextInt();
				if (seat[seatNum - 1] == 1) {
					System.out.println("이미 예약된 좌석입니다."); // 예외 처리
				} else {
					System.out.println("예약되었습니다.");

					seat[seatNum - 1] = 1; // 예약된 좌석에 1 대입
				}

				for (int i = 0; i < seat.length; i++) {
					sum = sum + seat[i]; // while문 조건 설정(이중반복이므로 10이아닌 55를 사용)
				}
			} else if (will == 0) { // 예약받을때 0을 입력하면 반복문을 빠져나온다.
				break;
			}
		}
	}
}
