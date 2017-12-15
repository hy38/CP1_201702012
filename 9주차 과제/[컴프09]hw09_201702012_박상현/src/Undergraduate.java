class Undergraduate extends Student {
	
	public String 소속동아리; //소속동아리를 필드로 설정함.
	
	public Undergraduate(){
		name = "서지수";
		hak_bun = 201602016;
		소속_학과 = "수학과";
		gradeLevel = 2;
		이수_학점수 = 70;
		소속동아리 = "SPG"; //적절한 생성자 메소드 작성(1).
	}
	
	public Undergraduate(String name, String 소속동아리){
		this.name = name;
		hak_bun = 201702017;
		소속_학과 = "의예과";
		gradeLevel = 1; 
		this.소속동아리 = 소속동아리; //적절한 생성자 메소드 작성(2).
	}
	
	public String toString(){ //객체의 모든 정보 출력 메소드.
		return name + "\n학번 : " + hak_bun + "\n" + 소속_학과 + "\n" + gradeLevel + "학년\n" + 이수_학점수 + "학점\n동아리 : " + 소속동아리;
	}
	
	
	
	public void set소속동아리(String 소속동아리) { this.소속동아리 = 소속동아리; } //적절한 변경자 메소드 작성
	
	public String get소속동아리() { return 소속동아리; } //적절한 접근자 메소드 작성
	
	
}
