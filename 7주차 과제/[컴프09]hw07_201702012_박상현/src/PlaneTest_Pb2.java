
public class PlaneTest_Pb2 {

	public static void main(String[] args) {
		Plane a = new Plane("T사", "비행기777", 777); //Plane 클래스를 테스트
		a.print();
		
		Plane b = new Plane();
		b.print();
		
		Plane c = new Plane(3298);
		c.print();
		
		System.out.println("총 비행기 수 : " + Plane.getPlanes());

	}

}
