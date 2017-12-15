class Plane {
	private String maker; //���ۻ�, ��, �ִ� �°��� ���� �������ʵ� ����
	private String model;
	private int max_pass;

	public String getMaker() { //��� �ʵ��� �����ڿ� ������ �޼ҵ带 �ۼ�(Line6~Line29)
		return maker;
	}

	public void setMaker(String m) {
		maker = m;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String n) {
		model = n;
	}

	public int getMax_Pass() {
		return max_pass;
	}

	public void setMax_Pass(int p) {
		max_pass = p;
	}

	public Plane(String maker, String model, int max_pass) { //Plane Ŭ������ �����ڸ� 3�� �ߺ�����(Line30~Line40)
		setValue(maker, model, max_pass);
	}

	public Plane() {
		setValue("S��", "�����100", 100);
	}

	public Plane(int max_pass) {
		setValue("A��", "�����1", max_pass);
	}

	static int planes = 0; //������ ����� ���� ��Ÿ���� �������� planes �߰�

	public static int getPlanes() { //�������� planes�� ��ȯ�ϴ� ���� �޼ҵ� getPlanes() �߰�
		return planes;
	}

	public void setValue(String maker, String model, int max_pass) { //�����͸� �����ϴ� setValue �޼ҵ� �ۼ�
		this.maker = maker;
		this.model = model;
		this.max_pass = max_pass;
		planes++; //**�̺κ�**
	}

	public void print() { //print() �޼ҵ� �߰�
		System.out.println(maker + "\t" + model + "\t" + max_pass);
	}

}	