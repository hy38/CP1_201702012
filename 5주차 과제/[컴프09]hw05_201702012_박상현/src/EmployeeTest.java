class Employee {
	String name, number, a, b; // �̸�, ��ȭ��ȣ�� ���� ���� ����� �Ű����� a, b ����
	int c, annualSalary; // �Ű����� c�� ������ ���� ���� ����

	public void setName(String a) { // �̸��� ���� ������ �ۼ�
		name = a;
	}

	public String getName() { // �̸��� ���� ������ �ۼ�
		return name;
	}

	public void setNumber(String b) { // ��ȭ��ȣ�� ���� ������ �ۼ�
		number = b;
	}

	public String getNumber() { // ��ȭ��ȣ�� ���� ������(String) �ۼ�
		return number;
	}

	public void setAnnualSalary(int c) { // ������ ���� ������ �ۼ�
		annualSalary = c;
	}

	public int getAnnualSalary() { // ������ ���� ������ �ۼ�
		return annualSalary;
	}

	public void print() { // �̸��� ��ȭ��ȣ�� ������ ����ϴ� void print() �޼ҵ� �ۼ�
		System.out.println("�̸�: " + getName() + " \n��ȭ��ȣ: " + getNumber() + "\n����: " + getAnnualSalary() + "����");
	}
}

public class EmployeeTest {

	public static void main(String[] args) {

		Employee c = new Employee(); // Employee class ȣ��
		c.setName("�ڻ���");
		c.setNumber("01062023298"); // String���� ��ȭ��ȣ ����
		c.setAnnualSalary(20000);
		c.print();
	}

}
