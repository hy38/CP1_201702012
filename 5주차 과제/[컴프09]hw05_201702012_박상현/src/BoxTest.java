class Box {
	int garo; // ����, ����, ����, ������ ���� ����
	int sero;
	int nopi;
	int volume;
	int a, b, c; // �Ű����� a, b, c ����

	public void setGaro(int a) { // garo�� ���� ������ �޼ҵ� �ۼ�
		garo = a;
	}

	public void setSero(int b) { // sero�� ���� ������ �޼ҵ� �ۼ�
		sero = b;
	}

	public void setNopi(int c) { // nopi�� ���� ������ �޼ҵ� �ۼ�
		nopi = c;
	}

	public int getGaro() { // garo�� ���� ������ �޼ҵ� �ۼ�
		return garo;
	}

	public int getSero() { // sero�� ���� ������ �޼ҵ� �ۼ�
		return sero;
	}

	public int getNopi() { // nopi�� ���� ������ �޼ҵ� �ۼ�
		return nopi;
	}

	public int getVolume() {
		volume = getGaro() * getSero() * getNopi();
		return volume;
		// �޼ҵ� ���ο��� ������ ���
	}

	public void print() { // �ʵ尪�� ����ϴ� void print() �޼ҵ� �ۼ�
		System.out.println("����:" + getGaro() + " ����:" + getSero() + " ����: " + getNopi());
		// �޼ҵ� ���ο��� ������ ���
	}

}

public class BoxTest {

	public static void main(String[] args) {
		Box k = new Box(); // Box class ȣ��
		k.setGaro(10);
		k.setSero(20);
		k.setNopi(50);
		k.print();
		System.out.println("����: " + k.getVolume());

	}

}
