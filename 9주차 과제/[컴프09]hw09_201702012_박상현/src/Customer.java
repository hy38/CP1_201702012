class Customer extends Person { //Person 클래스를 상속받음

	public String clientNum;
	public int mileage; //고객번호와 마일리지를 필드로 가짐.

	public Customer() {
		name = "연제서";
		address = "순천";
		clientNum = "010-9989-3007"; //생성자 1 작성.
		mileage = 1500;
	}

	public Customer(String name) {
		this.name = name;
		address = "인천";
		clientNum = "010-2304-3230"; //생성자 2 작성.
		mileage = 3400;
	}

	public String toString() {
		return name + "\n" + address + "\n" + clientNum + "\n" + mileage;
	}

	public void setClientNum(String clientNum) { this.clientNum = clientNum; }
	public void setMileage(int mileage) { this.mileage = mileage; }

	public String getClientNum() { return clientNum; }
	public int getMileage() { return mileage; } //적절한 접근자 메소드와 설정자 메소드 작성.

	
}
