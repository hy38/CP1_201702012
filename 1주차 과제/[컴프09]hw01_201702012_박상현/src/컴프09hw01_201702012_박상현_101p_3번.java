import java.util.Scanner;

public class ����09hw01_201702012_�ڻ���_101p_3�� {

	public static void main(String[] args) {
		double inch; // inch�� double�� ���·� ����
		double feet; // feet�� double�� ���·� ����
		double cench; // cench�� double�� ���·� ����

		Scanner input = new Scanner(System.in); // Scanner class ���
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		cench = input.nextDouble(); // ����ڿ��Ժ��� cm���� �Է¹޴´�.

		System.out.printf("%.0fcm�� %d��Ʈ %.15f��ġ�Դϴ�.", cench, (int) (cench / (12 * 2.54)),
				(cench - (((int) (cench / (12 * 2.54))) * (12 * 2.54))) / 2.54); // printf��
																					// ����Ͽ�
																					// �������
																					// ����Ͽ����ϴ�.

	}

}
