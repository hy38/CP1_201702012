import java.util.Scanner;

public class ����09hw01_201702012_�ڻ���_101p_4�� {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);  //Scanner class ���

		int radius;  //radius�� int�� ���·� ����
		int height;  //height�� int�� ���·� ����
		double volume;  //volume�� double�� ���·� ����
		
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		radius = input.nextInt(); //����ڿ��Ժ��� ������ ���� �Է¹޴´�.
		
		System.out.print("������� ���̸� �Է��Ͻÿ�: "); //����ڿ��Ժ��� ���� ���� �Է¹޴´�.
		height = input.nextInt();
		
		volume = radius * radius * Math.PI * height;  //3.14�� �ϸ� å�� ������� �ٸ��� ���� �ٸ��� Ǯ�����ϴ�.
		
		System.out.printf("������� ���Ǵ�: %.2f", volume); //����� ���
	}

}
