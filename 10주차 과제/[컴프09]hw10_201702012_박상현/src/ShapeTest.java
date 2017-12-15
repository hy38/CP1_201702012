import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("(Circle의 area는 width*width*3 으로 계산됩니다.) \nwidth 와 height 입력 : ");
		
		Shape s1 = new Shape(input.nextInt(), input.nextInt()); //사용자에게 width와 height를 입력받아
		
		Triangle t1 = new Triangle(s1.width, s1.height);
		Rectangle r1 = new Rectangle(s1.width, s1.height);
		Circle c1 = new Circle(s1.width, s1.height); //삼각형, 사각형, 원형의 객체 생성
		
		Shape[] calc = new Shape[3]; //Shape의 배열 shape[3]를 선언하여
		calc[0] = t1;
		calc[1] = r1;
		calc[2] = c1; //삼각형, 사각형, 원형을 배열에 저장

		for(int i=0; i<calc.length; i++){ //반복문과 배열 shape[3]를 이용하여
			System.out.println(calc[i].area()); //각 도형의 넓이 출력
		} //삼각형, 사각형, 원형 순서로 출력됨.
		
	}

}
