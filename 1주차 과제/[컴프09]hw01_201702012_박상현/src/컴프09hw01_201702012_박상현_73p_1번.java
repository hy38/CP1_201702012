import java.util.Scanner;

public class ����09hw01_201702012_�ڻ���_73p_1�� {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Scanner class ���
		double mile;  // mile�� double�� ���·� ����
		double kilometer; //kilometer�� double�� ���·� ����

		System.out.print("������ �Է��Ͻÿ�: ");
		mile = input.nextDouble(); //����ڷκ��� mile�� ���� �Է¹޴´�.
		kilometer = mile * 1.609;  //kilometer�� mile�� ���踦 ǥ���ߴ�.
		System.out.printf("%.0f������ %.2fų�ι����Դϴ�.", mile, kilometer); //printf�� ����ϵ� ���翡 �����ִ´�� 
		                                                               //�Ҽ��� �ڸ����� �����Ͽ���.

	}

}
