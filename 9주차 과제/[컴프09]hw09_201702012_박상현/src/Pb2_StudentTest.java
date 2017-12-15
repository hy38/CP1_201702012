
public class Pb2_StudentTest {

	public static void main(String[] args) {
//Student 클래스 테스트
		Student s1 = new Student();
		System.out.println(s1.toString());
	
		System.out.println();
		
		Student s2 = new Student("김민철", 200902003, 6);
		System.out.println(s2.toString());
		
		System.out.println();
//Undergraduate 클래스 테스트
		Undergraduate u1 = new Undergraduate();
		System.out.println(u1.toString());
		
		System.out.println();
		
		Undergraduate u2 = new Undergraduate("민선기", "ProBrain");
		System.out.println(u2.toString());
		
		System.out.println();
//GraduateStudent 클래스 테스트
		GraduateStudent g1 = new GraduateStudent();
		System.out.println(g1.toString());
	
		System.out.println();
		
		GraduateStudent g2 = new GraduateStudent("김홍구", "연구조교");
		System.out.println(g2.toString());
		
	}

}
