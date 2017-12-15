import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("(Circle�� area�� width*width*3 ���� ���˴ϴ�.) \nwidth �� height �Է� : ");
		
		Shape s1 = new Shape(input.nextInt(), input.nextInt()); //����ڿ��� width�� height�� �Է¹޾�
		
		Triangle t1 = new Triangle(s1.width, s1.height);
		Rectangle r1 = new Rectangle(s1.width, s1.height);
		Circle c1 = new Circle(s1.width, s1.height); //�ﰢ��, �簢��, ������ ��ü ����
		
		Shape[] calc = new Shape[3]; //Shape�� �迭 shape[3]�� �����Ͽ�
		calc[0] = t1;
		calc[1] = r1;
		calc[2] = c1; //�ﰢ��, �簢��, ������ �迭�� ����

		for(int i=0; i<calc.length; i++){ //�ݺ����� �迭 shape[3]�� �̿��Ͽ�
			System.out.println(calc[i].area()); //�� ������ ���� ���
		} //�ﰢ��, �簢��, ���� ������ ��µ�.
		
	}

}
