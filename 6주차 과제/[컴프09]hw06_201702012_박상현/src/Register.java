import java.util.Scanner; //Scanner class import
class Register { //Register class �ۼ�
	Scanner input = new Scanner(System.in); //Scanner class ����
	String ID1, ID2, PW1, PW2; //ȸ�������� ID, PW�� �α����� ID, PW ������ ���� String������ ����
	
	public void getInformations(){ //getInformations �޼ҵ� ����
		System.out.println("<��������>");
		System.out.print("���̵� �Է��Ͻÿ�: ");
		ID1 = input.next();
		System.out.print("��й�ȣ�� �Է��Ͻÿ�: ");
		PW1 = input.next();

		System.out.println("<�α���>");
		System.out.print("���̵� �Է��Ͻÿ�: ");
		ID2 = input.next();
		System.out.print("��й�ȣ�� �Է��Ͻÿ�: ");
		PW2 = input.next();
	}
	
	public void isEqual(){ //isEqual �޼ҵ� ����
		if(ID1.equals(ID2) && PW1.equals(PW2)) //if���� ����Ͽ� ID1�� ID2, PW1�� PW2 ��
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
		else //�Ѵ� ���� ��쿡�� �α����� �����ϵ��� ��.
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
		
	}
}
