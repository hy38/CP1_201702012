
public class Pb1_CustomerTest {

	public static void main(String[] args) {

		Person p1 = new Person(); //Person Ŭ������ ��ü ����(1).
		System.out.println(p1.toString()); //��ü�� ��� ���� ���.
		
		System.out.println();
		
		Person p2 = new Person("���ܺ�", "����", "010-6789-1234"); //Person Ŭ������ ��ü ����(2).
		System.out.println(p2.toString());
		
		
		System.out.println();
		
		
		Customer c1 = new Customer(); //Customer Ŭ������ ��ü ����(1).
		System.out.println(c1.toString()); //��ü�� ��� ���� ���.

		System.out.println();
		
		Customer c2 = new Customer("������"); //Customer Ŭ������ ��ü ����(2).
		System.out.println(c2.toString());
		
		
	}

}
