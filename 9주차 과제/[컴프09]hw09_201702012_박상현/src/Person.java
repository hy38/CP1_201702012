class Person { //Person 클래스 설계
	public String name;
	public String address;
	public String telNum; //이름, 주소, 전화번호를 필드로 가짐.

	public Person(String name, String address, String telNum) {
		this.name = name;
		this.address = address;
		this.telNum = telNum; //생성자 1 정의

	}

	public Person() {
		name = "박상현";
		address = "충주";
		telNum = "010-6202-3298"; //생성자 2 정의
	}
	
	public String toString() {
		return name + "\n" + address + "\n" + telNum;
	}
	
	public void setName(String name) { this.name = name; }
	public void setAddress(String address) { this.address = address; }
	public void setTelNum(String telNum) { this.telNum = telNum; }
	
	public String getName() { return name; }
	public String getAddress() { return address; }
	public String getTelNum() { return telNum; } //각 필드에 대하여 접근자와 설정자 메소드 작성.
	
	

}