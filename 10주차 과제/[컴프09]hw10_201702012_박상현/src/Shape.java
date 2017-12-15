
public class Shape {	//����Ŭ���� Shape �ۼ�

	int width, height;	//����Ŭ������ ������� ����

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
	public int getHeight(){ return height; } //������ �ʵ�鿡 ���� �����ڿ� ������ �޼ҵ� ����.
}

class Triangle extends Shape {	//����Ŭ���� Triangle �ۼ�
	Triangle(int width, int height) {
		super(width, height);
	}
	public int area() {
		return width * height / 2;
	}
}

class Rectangle extends Shape {	//����Ŭ���� Rectangle �ۼ�
	Rectangle(int width, int height) {
		super(width, height);
	}
	public int area() {
		return width * height;
	}
}

class Circle extends Shape {	//����Ŭ���� Circle �ۼ�
	Circle(int width, int height) {
		super(width, height);
	}
	public int area() {
		return width * width * 3; //radius��� �ʵ带 ���� �����ϱ� �ָ��ؼ� width�� �ι� ���ϵ��� ������ ��������ϴ�.
		//Math.PI �� ����ϰԵǸ� double���� �Ǿ� PI���� 3���� ����Ͽ����ϴ�.
	}
}