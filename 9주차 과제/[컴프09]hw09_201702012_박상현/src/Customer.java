class Customer extends Person { //Person Ŭ������ ��ӹ���

	public String clientNum;
	public int mileage; //����ȣ�� ���ϸ����� �ʵ�� ����.

	public Customer() {
		name = "������";
		address = "��õ";
		clientNum = "010-9989-3007"; //������ 1 �ۼ�.
		mileage = 1500;
	}

	public Customer(String name) {
		this.name = name;
		address = "��õ";
		clientNum = "010-2304-3230"; //������ 2 �ۼ�.
		mileage = 3400;
	}

	public String toString() {
		return name + "\n" + address + "\n" + clientNum + "\n" + mileage;
	}

	public void setClientNum(String clientNum) { this.clientNum = clientNum; }
	public void setMileage(int mileage) { this.mileage = mileage; }

	public String getClientNum() { return clientNum; }
	public int getMileage() { return mileage; } //������ ������ �޼ҵ�� ������ �޼ҵ� �ۼ�.

	
}
