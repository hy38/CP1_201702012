
public class PlaneTest_Pb2 {

	public static void main(String[] args) {
		Plane a = new Plane("T��", "�����777", 777); //Plane Ŭ������ �׽�Ʈ
		a.print();
		
		Plane b = new Plane();
		b.print();
		
		Plane c = new Plane(3298);
		c.print();
		
		System.out.println("�� ����� �� : " + Plane.getPlanes());

	}

}
