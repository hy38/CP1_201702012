import java.util.*;

public class CP1_09_hw04_201702012_PROBLEM1 {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());

		int num1 = 0;//6���� ������ �Է¹��� 6���� ���� ����
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;

		for (int i = 1; i < 7; i++) { //for���� switch������ 6���� ������ 6���� ���� �Է�
			switch (i) { //switch�� for���� i�� �Է�
			case 1: //num1�� ù��° ���� ����
				num1 = rand.nextInt(45) + 1;
				break;
			case 2: //num2�� ���� ����
				num2 = rand.nextInt(45) + 1;
				while (num1 == num2) { //num1�� num2�� ���� ���������� while�� �ݺ�
					num2 = rand.nextInt(45) + 1;
				}
				break;
			case 3: //num3�� ���� ����
				num3 = rand.nextInt(45) + 1;
				while (num1 == num3 || num2 == num3) { // num3�� �ռ� ������ ������� ���� ���������� while�� �ݺ�
					num3 = rand.nextInt(45) + 1;
				}
				break;
			case 4: //num4�� ���� ����
				num4 = rand.nextInt(45) + 1;
				while (num1 == num4 || num2 == num4 || num3 == num4) { // num4�� �ռ� ������ ������� ���� ���������� while�� �ݺ�
					num4 = rand.nextInt(45) + 1;
				}
				break;
			case 5: //num5�� ���� ����
				num5 = rand.nextInt(45) + 1;
				while ((num5 == num1) || (num5 == num2) || (num5 == num3) || (num5 == num4)) { //num5�� �ռ� ������ ������� ���� ���������� while�� �ݺ�
					num5 = rand.nextInt(45) + 1;
				}
				break;
			case 6: //num6�� ���� ����
				num6 = rand.nextInt(45) + 1;
				while ((num1 == num6) || (num2 == num6) || (num3 == num6) || (num4 == num6) || (num5 == num6)) { //num6�� �ռ� ������ ������� ���� ���������� while�� �ݺ�
					num6 = rand.nextInt(45) + 1;
				}
				break;
			}
		}
		System.out.println(num1 + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5 + "\t" + num6); //����� ���
	}

}
