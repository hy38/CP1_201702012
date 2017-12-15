
public class Pb1_CustomerTest {

	public static void main(String[] args) {

		Person p1 = new Person(); //Person 클래스의 객체 생성(1).
		System.out.println(p1.toString()); //객체의 모든 정보 출력.
		
		System.out.println();
		
		Person p2 = new Person("유단비", "대전", "010-6789-1234"); //Person 클래스의 객체 생성(2).
		System.out.println(p2.toString());
		
		
		System.out.println();
		
		
		Customer c1 = new Customer(); //Customer 클래스의 객체 생성(1).
		System.out.println(c1.toString()); //객체의 모든 정보 출력.

		System.out.println();
		
		Customer c2 = new Customer("정지우"); //Customer 클래스의 객체 생성(2).
		System.out.println(c2.toString());
		
		
	}

}
