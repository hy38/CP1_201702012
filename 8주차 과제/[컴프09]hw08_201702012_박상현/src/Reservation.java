import java.util.*;

public class Reservation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] seat = new int[10]; // ũ�Ⱑ 10�� seat�迭�� �����Ѵ�.
		for (int i = 0; i < seat.length; i++)
			seat[i] = 0; // seat�迭�� 0�� ��� �����Ѵ�.
		int sum = 0; // while���ǹ� �ȿ� ���� ���� sum�� 0���� �ʱ�ȭ�Ѵ�.

		while (sum < 55) {
			System.out.println("�¼��� �����Ͻðڽ��ϱ�? (1 �Ǵ� 0)");
			int will = input.nextInt(); // �����Ұ������� �Է¹޴´�.
			if (will == 1) {

				System.out.println("������ ���� ���´� ������ �����ϴ�.");
				System.out.println("------------------------------------------");
				for (int i = 1; i <= 10; i++)
					System.out.print(i + "  ");
				System.out.println();
				System.out.println("------------------------------------------");
				for (int i = 0; i < seat.length; i++) {
					System.out.print(seat[i] + "  ");
				}
				System.out.println();
				System.out.println("���° �¼��� �����Ͻðڽ��ϱ�? ");
				int seatNum = input.nextInt();
				if (seat[seatNum - 1] == 1) {
					System.out.println("�̹� ����� �¼��Դϴ�."); // ���� ó��
				} else {
					System.out.println("����Ǿ����ϴ�.");

					seat[seatNum - 1] = 1; // ����� �¼��� 1 ����
				}

				for (int i = 0; i < seat.length; i++) {
					sum = sum + seat[i]; // while�� ���� ����(���߹ݺ��̹Ƿ� 10�̾ƴ� 55�� ���)
				}
			} else if (will == 0) { // ��������� 0�� �Է��ϸ� �ݺ����� �������´�.
				break;
			}
		}
	}
}
