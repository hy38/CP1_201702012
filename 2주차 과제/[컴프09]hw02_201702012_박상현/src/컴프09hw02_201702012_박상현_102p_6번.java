import java.util.Scanner;

public class ����09hw02_201702012_�ڻ���_102p_6�� {

	public static void main(String[] args) {

		int money_500; // 500��¥���� ������ int�� ���·� ����
		int money_100; // 100��¥���� ������ int�� ���·� ����
		int money_50; // 50��¥���� ������ int�� ���·� ����
		int money_10; // 10��¥���� ������ int�� ���·� ����

		int totalAmount; // �����뿡 ����ִ� �ݾ��� ������ int�� ����

		Scanner input = new Scanner(System.in); // ��ĳ�� class ���

		System.out.print("500��¥�� ������ ������ �Է��Ͻÿ�: ");
		money_500 = input.nextInt(); // ����ڿ��� 500�� ¥�� ������ ������ �Է¹޾� money_500��
										// ������.

		System.out.print("100��¥�� ������ ������ �Է��Ͻÿ�: ");
		money_100 = input.nextInt(); // ����ڿ��� 100�� ¥�� ������ ������ �Է¹޾� money_100��
										// ������.

		System.out.print("50��¥�� ������ ������ �Է��Ͻÿ�: ");
		money_50 = input.nextInt(); // ����ڿ��� 50�� ¥�� ������ ������ �Է¹޾� money_50�� ������.

		System.out.print("10��¥�� ������ ������ �Է��Ͻÿ�: ");
		money_10 = input.nextInt(); // ����ڿ��� 10�� ¥�� ������ ������ �Է¹޾� money_10�� ������.

		totalAmount = money_500 * 500 + money_100 * 100 + money_50 * 50 + money_10 * 10; // �����뿡
																							// ����ִ�
																							// ����
																							// ������
																							// ���ϴ�
																							// ����

		System.out.println("�����뿡 ����ִ� ���� �Ѿ��� :" + totalAmount); // ����� ���

	}

}
