
public class Pb2_StudentTest {

	public static void main(String[] args) {
//Student Ŭ���� �׽�Ʈ
		Student s1 = new Student();
		System.out.println(s1.toString());
	
		System.out.println();
		
		Student s2 = new Student("���ö", 200902003, 6);
		System.out.println(s2.toString());
		
		System.out.println();
//Undergraduate Ŭ���� �׽�Ʈ
		Undergraduate u1 = new Undergraduate();
		System.out.println(u1.toString());
		
		System.out.println();
		
		Undergraduate u2 = new Undergraduate("�μ���", "ProBrain");
		System.out.println(u2.toString());
		
		System.out.println();
//GraduateStudent Ŭ���� �׽�Ʈ
		GraduateStudent g1 = new GraduateStudent();
		System.out.println(g1.toString());
	
		System.out.println();
		
		GraduateStudent g2 = new GraduateStudent("��ȫ��", "��������");
		System.out.println(g2.toString());
		
	}

}
