class GraduateStudent extends Student{

	public String TA;
	public double scholarShip; //���������� ���к����� �ʵ�� ������.
	
	public GraduateStudent(){
		name = "�̼���";
		hak_bun = 201102011;
		�Ҽ�_�а� = "���ؿ�ȭ��";
		gradeLevel = 3;
		�̼�_������ = 60;
		TA = "��������"; //������ ������ �޼ҵ� �ۼ�(1).
		scholarShip = 0.6;
	}

	public GraduateStudent(String name, String TA){
		this.name = name;
		hak_bun = 201302013;
		�Ҽ�_�а� = "����а�";
		gradeLevel = 8; 
		�̼�_������ = 160;
		this.TA = TA; //������ ������ �޼ҵ� �ۼ�(2).
		scholarShip = 0.4;
	}
	
	public String toString(){ //��ü�� ��� ���� ��� �޼ҵ�.
		return name + "\n�й� : " + hak_bun + "\n" + �Ҽ�_�а� + "\n" + gradeLevel + "�г�\n" + �̼�_������ + "����\n" + TA + "\n���к��� : " + scholarShip;
	}

	public void setTA(String TA) { this.TA = TA; }
	public void setScholarShip(double scholarShip) { this.scholarShip = scholarShip; }  //������ ������ �޼ҵ� �ۼ�
	
	public String getTA() { return TA; }
	public double getScholarShip() { return scholarShip; }  //������ ������ �޼ҵ� �ۼ�
					
}