import java.util.Scanner;

public class ����09hw02_201702012_�ڻ���_102p_7�� {

	public static void main(String[] args) {

		float pyung; // ���� float�� ���·� ����
		float pyungbangMeter; // �����͸� float�� ���·� ����

		Scanner input = new Scanner(System.in); // ��ĳ�� class ���
		System.out.print("�����ͷ� ȯ���ϰ� ���� ���� ���� �Է��Ͻÿ�: ");
		pyung = input.nextFloat(); // ����ڿ��Ժ��� �Է¹��� ���� ���� pyung�� ����

		pyungbangMeter = pyung * 3.3058f; // �����Ϳ� ����� ���踦 ��Ÿ��. f�� 3.3058�ڿ� �ٿ�
											// float�ڷ����� ǥ����.

		System.out.println(+pyung + "���� " + pyungbangMeter + "������ �Դϴ�."); // �����
																			// ���
	}

}
