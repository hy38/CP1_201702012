class Person { //Person Ŭ���� ����
	public String name;
	public String address;
	public String telNum; //�̸�, �ּ�, ��ȭ��ȣ�� �ʵ�� ����.

	public Person(String name, String address, String telNum) {
		this.name = name;
		this.address = address;
		this.telNum = telNum; //������ 1 ����

	}

	public Person() {
		name = "�ڻ���";
		address = "����";
		telNum = "010-6202-3298"; //������ 2 ����
	}
	
	public String toString() {
		return name + "\n" + address + "\n" + telNum;
	}
	
	public void setName(String name) { this.name = name; }
	public void setAddress(String address) { this.address = address; }
	public void setTelNum(String telNum) { this.telNum = telNum; }
	
	public String getName() { return name; }
	public String getAddress() { return address; }
	public String getTelNum() { return telNum; } //�� �ʵ忡 ���Ͽ� �����ڿ� ������ �޼ҵ� �ۼ�.
	
	

}