class Undergraduate extends Student {
	
	public String �Ҽӵ��Ƹ�; //�Ҽӵ��Ƹ��� �ʵ�� ������.
	
	public Undergraduate(){
		name = "������";
		hak_bun = 201602016;
		�Ҽ�_�а� = "���а�";
		gradeLevel = 2;
		�̼�_������ = 70;
		�Ҽӵ��Ƹ� = "SPG"; //������ ������ �޼ҵ� �ۼ�(1).
	}
	
	public Undergraduate(String name, String �Ҽӵ��Ƹ�){
		this.name = name;
		hak_bun = 201702017;
		�Ҽ�_�а� = "�ǿ���";
		gradeLevel = 1; 
		this.�Ҽӵ��Ƹ� = �Ҽӵ��Ƹ�; //������ ������ �޼ҵ� �ۼ�(2).
	}
	
	public String toString(){ //��ü�� ��� ���� ��� �޼ҵ�.
		return name + "\n�й� : " + hak_bun + "\n" + �Ҽ�_�а� + "\n" + gradeLevel + "�г�\n" + �̼�_������ + "����\n���Ƹ� : " + �Ҽӵ��Ƹ�;
	}
	
	
	
	public void set�Ҽӵ��Ƹ�(String �Ҽӵ��Ƹ�) { this.�Ҽӵ��Ƹ� = �Ҽӵ��Ƹ�; } //������ ������ �޼ҵ� �ۼ�
	
	public String get�Ҽӵ��Ƹ�() { return �Ҽӵ��Ƹ�; } //������ ������ �޼ҵ� �ۼ�
	
	
}
