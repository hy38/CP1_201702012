class GraduateStudent extends Student{

	public String TA;
	public double scholarShip; //조교유형과 장학비율을 필드로 설정함.
	
	public GraduateStudent(){
		name = "이선미";
		hak_bun = 201102011;
		소속_학과 = "연극영화과";
		gradeLevel = 3;
		이수_학점수 = 60;
		TA = "교육조교"; //적절한 생성자 메소드 작성(1).
		scholarShip = 0.6;
	}

	public GraduateStudent(String name, String TA){
		this.name = name;
		hak_bun = 201302013;
		소속_학과 = "통계학과";
		gradeLevel = 8; 
		이수_학점수 = 160;
		this.TA = TA; //적절한 생성자 메소드 작성(2).
		scholarShip = 0.4;
	}
	
	public String toString(){ //객체의 모든 정보 출력 메소드.
		return name + "\n학번 : " + hak_bun + "\n" + 소속_학과 + "\n" + gradeLevel + "학년\n" + 이수_학점수 + "학점\n" + TA + "\n장학비율 : " + scholarShip;
	}

	public void setTA(String TA) { this.TA = TA; }
	public void setScholarShip(double scholarShip) { this.scholarShip = scholarShip; }  //적절한 변경자 메소드 작성
	
	public String getTA() { return TA; }
	public double getScholarShip() { return scholarShip; }  //적절한 접근자 메소드 작성
					
}