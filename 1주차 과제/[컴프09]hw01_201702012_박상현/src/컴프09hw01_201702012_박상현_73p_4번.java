import java.util.Scanner;

public class ����09hw01_201702012_�ڻ���_73p_4�� {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); //Scanner class ���

		double ����C; //����C�� double�� ���·� ����
		double ȭ��F; //ȭ��F�� double�� ���·� ����
		System.out.print("ȭ���µ��� �Է��ϼ���: ");
		ȭ��F = input.nextDouble(); //����ڿ��� ȭ���µ��� �Է¹޴´�.

		����C = (ȭ��F - 32) * 5 / 9; //�����µ��� ȭ���µ��� ���踦 ǥ���Ͽ���.

		System.out.println("���� �µ��� : " + ����C); //������� ����Ͽ���.

	}

}
