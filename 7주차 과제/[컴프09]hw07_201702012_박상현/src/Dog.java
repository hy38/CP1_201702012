class Dog {
	private String name; //�������� �̸�, ����, ������ �ʵ带 ������ ���������ڸ� ����Ͽ� ����
	public static String breed;
	private int age;

	public void setValue(String name, String breed, int age) { //�����͸� �����ϴ� setValue �޼ҵ� �ۼ�
		this.name = name;
		Dog.breed = breed;
		this.age = age;
	}

	public Dog(String name, int age) { //������ �̸��� ���̸� �ʱ�ȭ�ϴ� ������ �޼ҵ� ����
		setValue(name, "����", age);
	}

	public Dog(String name, String breed, int age) { //�������� �̸�, ����, ���̸� �ʱ�ȭ�ϴ� ������ �޼ҵ� ����
		setValue(name, breed, age);
	}

	public void print() { //�������� ������ ����ϴ� �޼ҵ� ����
		System.out.println("�̸�:" + name + "\n����: " + breed + "\n����: " + age);
	}
}