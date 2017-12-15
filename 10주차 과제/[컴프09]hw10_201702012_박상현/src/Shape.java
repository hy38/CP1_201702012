
public class Shape {	//슈퍼클래스 Shape 작성

	int width, height;	//슈퍼클래스의 멤버변수 선언

	Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int area() {
		return width * height;
	}
	
	public void setWidth(){ this.width = width; }
	public void setHeight(){ this.height = height; }
	public int getWidth(){ return width; }
	public int getHeight(){ return height; } //각각의 필드들에 대한 설정자와 접근자 메소드 생성.
}

class Triangle extends Shape {	//서브클래스 Triangle 작성
	Triangle(int width, int height) {
		super(width, height);
	}
	public int area() {
		return width * height / 2;
	}
}

class Rectangle extends Shape {	//서브클래스 Rectangle 작성
	Rectangle(int width, int height) {
		super(width, height);
	}
	public int area() {
		return width * height;
	}
}

class Circle extends Shape {	//서브클래스 Circle 작성
	Circle(int width, int height) {
		super(width, height);
	}
	public int area() {
		return width * width * 3; //radius라는 필드를 따로 선언하기 애매해서 width를 두번 곱하도록 수식을 만들었습니다.
		//Math.PI 를 사용하게되면 double형이 되어 PI값을 3으로 계산하였습니다.
	}
}