class Employee {
	String name, number, a, b; // 이름, 전화번호에 대한 변수 선언과 매개변수 a, b 선언
	int c, annualSalary; // 매개변수 c와 연봉에 대한 변수 선언

	public void setName(String a) { // 이름에 대한 생성자 작성
		name = a;
	}

	public String getName() { // 이름에 대한 접근자 작성
		return name;
	}

	public void setNumber(String b) { // 전화번호에 대한 생성자 작성
		number = b;
	}

	public String getNumber() { // 전화번호에 대한 접근자(String) 작성
		return number;
	}

	public void setAnnualSalary(int c) { // 연봉에 대한 생성자 작성
		annualSalary = c;
	}

	public int getAnnualSalary() { // 연봉에 대한 접근자 작성
		return annualSalary;
	}

	public void print() { // 이름과 전화번호와 연봉을 출력하는 void print() 메소드 작성
		System.out.println("이름: " + getName() + " \n전화번호: " + getNumber() + "\n연봉: " + getAnnualSalary() + "만원");
	}
}

public class EmployeeTest {

	public static void main(String[] args) {

		Employee c = new Employee(); // Employee class 호출
		c.setName("박상현");
		c.setNumber("01062023298"); // String으로 전화번호 설정
		c.setAnnualSalary(20000);
		c.print();
	}

}
