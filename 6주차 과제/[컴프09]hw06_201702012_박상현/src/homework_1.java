import java.util.Scanner;

public class homework_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner class ����
		Reversing r = new Reversing(); // Reversing class ����

		String str; //�Է¹��� ���ڿ��� ������ ���� str ����

		System.out.println("���ڿ��� �Է��Ͻÿ�: "); 
		str = input.next(); //�Է¹��� ���ڿ��� str�� ����

		System.out.println(r.reverse(str)); //reverse Ŭ������ str �� �Է�
	}

}
