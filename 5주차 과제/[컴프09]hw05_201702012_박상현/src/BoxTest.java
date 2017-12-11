class Box {
	int garo; // 가로, 세로, 높이, 부피의 변수 생성
	int sero;
	int nopi;
	int volume;
	int a, b, c; // 매개변수 a, b, c 생성

	public void setGaro(int a) { // garo에 대한 설정자 메소드 작성
		garo = a;
	}

	public void setSero(int b) { // sero에 대한 설정자 메소드 작성
		sero = b;
	}

	public void setNopi(int c) { // nopi에 대한 설정자 메소드 작성
		nopi = c;
	}

	public int getGaro() { // garo에 대한 접근자 메소드 작성
		return garo;
	}

	public int getSero() { // sero에 대한 접근자 메소드 작성
		return sero;
	}

	public int getNopi() { // nopi에 대한 접근자 메소드 작성
		return nopi;
	}

	public int getVolume() {
		volume = getGaro() * getSero() * getNopi();
		return volume;
		// 메소드 내부에서 접근자 사용
	}

	public void print() { // 필드값을 출력하는 void print() 메소드 작성
		System.out.println("가로:" + getGaro() + " 세로:" + getSero() + " 높이: " + getNopi());
		// 메소드 내부에서 접근자 사용
	}

}

public class BoxTest {

	public static void main(String[] args) {
		Box k = new Box(); // Box class 호출
		k.setGaro(10);
		k.setSero(20);
		k.setNopi(50);
		k.print();
		System.out.println("부피: " + k.getVolume());

	}

}
