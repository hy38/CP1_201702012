class Student {
	public String name;
	public int hak_bun;
	public String �Ҽ�_�а�;
	public int gradeLevel;
	public int �̼�_������; //��� �л��� �̸�, �й� ,�Ҽ��а�, �г�, �̼��������� ������.

	public Student(){
		name = "�ڻ���";
		hak_bun =201702012;
		�Ҽ�_�а� = "��ǻ�Ͱ��а�";
		gradeLevel = 1;
		�̼�_������ = 35; //������ ������ �ۼ�(1).
	}

	public Student(String name, int hak_bun, int gradeLevel){
		this.name = name;
		this.hak_bun = hak_bun;
		�Ҽ�_�а� = "���ڰ��а�";
		this.gradeLevel = gradeLevel;
		�̼�_������ = 35; //������ ������ �ۼ�(2).
	}
	
	public String toString(){ //��ü�� ��� ���� ��� �޼ҵ�.
		return name + "\n�й� : " + hak_bun + "\n" + �Ҽ�_�а� + "\n" + gradeLevel + "�г�\n" + �̼�_������ + "����";
	}
	
	public void setName(String name) { this.name = name; }
	public void setHak_Bun(int hak_bun) { this.hak_bun = hak_bun; }
	public void set�Ҽ�_�а�(String �Ҽ�_�а�) { this.�Ҽ�_�а� = �Ҽ�_�а�; }
	public void setGradeLevel(int gradeLevel) { this.gradeLevel = gradeLevel; }
	public void set�̼�_������(int �̼�_������) { this.�̼�_������ = �̼�_������; } //������ ������ �޼ҵ� �ۼ�.

	public String getName() {	return name; }
	public int getHak_Bun() { return hak_bun; }
	public String get�Ҽ�_�а�() { return �Ҽ�_�а�;	}
	public int getGradeLevel() { return gradeLevel; }
	public int get�̼�_������() { return �̼�_������; } //������ ������ �޼ҵ� �ۼ�.

}
